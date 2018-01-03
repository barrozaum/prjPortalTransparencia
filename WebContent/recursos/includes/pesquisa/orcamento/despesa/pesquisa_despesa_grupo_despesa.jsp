
<%@page import="java.util.*"%>
<%@page import="dto.*"%>
<jsp:useBean id="mb_orcamento" class="manager.ManagerOrcamento"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	if (request.getParameter("exercicio").equals("")
			|| request.getParameter("codigoUnidadeGestora").equals("")) {
		out.print("<div class=\"alert alert-danger\"> POR FAVOR VERIFIQUE O EXERCICIO/UNIDADE GESTORA</div>");
	} else {
		Integer exercicio = new Integer(request.getParameter("exercicio"));
		Integer codigoUnidadeGestora = new Integer(request.getParameter("codigoUnidadeGestora"));
		Integer nivelGrupo = new Integer(request.getParameter("nivelGrupo"));
		mb_orcamento.pesquisaOrcamentoDespesaGrupoDespesa(exercicio, codigoUnidadeGestora);
		Integer exercicioEscolhida = 0;
		String unidaGestoraEscolhida = "Nenhum Resultado Localizado";
		if (mb_orcamento.getOrcamentoDespesaGrupoDespesa() != null) {
			exercicioEscolhida = mb_orcamento.getOrcamentoDespesaGrupoDespesa().getExercicioOrcamento();
			unidaGestoraEscolhida = mb_orcamento.getOrcamentoDespesaGrupoDespesa().getUnidadeGestora()
					.getDescricaoUnidade();
		}
%>


<div class="col-sm-12 col-md-12 col-lg-12 ">
	<div class="panel panel-info">
		<div class="panel-heading">
			<div class="panel-title">Orçamento Despesa-Grupo</div>
		</div>
		<div class="panel-body text-left">
			<div style="overflow: auto; max-width: 100%;">
				<table id="example" class="table table-hover table-striped">
					<thead>
						<tr>
							<th colspan="1">EXERCICIO</th>
							<th colspan="2">
								<%
									out.print(exercicioEscolhida);
								%>
							</th>
						</tr>
						<tr>
							<th colspan="1">Unidade Gestora</th>
							<th colspan="2"><input type="hidden"
							id="id_descricao_unidade_gestora"
							value="<%out.print(unidaGestoraEscolhida);%>"> 
							<% out.print(unidaGestoraEscolhida);%>
						</th>
						</tr>
						<tr>
							<th>CODIGO</th>
							<th>DESCRIÇÃO CATEGORIA</th>
							<th>VALOR ORÇADO</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="Total" value="${0}" />
						<c:set var="NIVEL_GRUPO" value="<%=nivelGrupo%>" />
						<c:set var="CODIGO_BASE_CATEGORIA" value="${''}" />
						<c:set var="CODIGO_BASE_NATUREZA" value="${''}" />
						<c:set var="CODIGO_BASE_MODALIDADE" value="${''}" />
						<c:set var="CODIGO_BASE_ELEMENTO" value="${''}" />
						<c:set var="CODIGO_BASE_SUBELEMENTO" value="${null}" />
						<c:forEach
							items="${mb_orcamento.getListaOrcamentoDespesaGrupoDespesa()}"
							var="linha">

							<c:set var="Total" value="${linha.valorTotalOrcado}" />
							
							<c:set var="CODIGO_CATEGORIA" value="${linha.categoria.codigo}" />
							<c:set var="CODIGO_NATUREZA" value="${linha.natureza.codigo}" />
							<c:set var="CODIGO_MODALIDADE" value="${linha.modalidade.codigo}" />
							<c:set var="CODIGO_ELEMENTO" value="${linha.elemento.codigo}" />
							<c:set var="CODIGO_SUBELEMENTO"
								value="${linha.subElemento.codigo}" />

							<c:set var="OBJ_CATEGORIA" value="${linha.categoria}" />
							<c:set var="OBJ_NATUREZA" value="${linha.natureza}" />
							<c:set var="OBJ_MODALIDADE" value="${linha.modalidade}" />
							<c:set var="OBJ_ELEMENTO" value="${linha.elemento}" />
							<c:set var="OBJ_SUBELEMENTO" value="${linha.subElemento}" />
							
							<c:if test="${NIVEL_GRUPO >= 1}">
								<c:if test="${OBJ_CATEGORIA != NULL}">
									<c:if test="${CODIGO_BASE_CATEGORIA != CODIGO_CATEGORIA}">
										<tr>
											<td>${linha.categoria.codigo}</td>
											<td>${linha.categoria.descricao}</td>
											<td><strong>${mb_orcamento.valorPorNivelDespesa(1,linha)}</strong></td>
											<c:set var="CODIGO_BASE_CATEGORIA"
												value="${linha.categoria.codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${NIVEL_GRUPO >= 2}">
								<c:if test="${OBJ_NATUREZA != NULL}">
									<c:if test="${CODIGO_BASE_NATUREZA != CODIGO_NATUREZA}">
										<tr>
											<td>${linha.natureza.codigo}</td>
											<td>&nbsp;&nbsp;${linha.natureza.descricao}</td>
											<td><strong>${mb_orcamento.valorPorNivelDespesa(2,linha)}</strong></td>
											<c:set var="CODIGO_BASE_NATUREZA"
												value="${linha.natureza.codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${NIVEL_GRUPO >= 3}">
								<c:if test="${OBJ_MODALIDADE != NULL}">
									<c:if test="${CODIGO_BASE_MODALIDADE != CODIGO_MODALIDADE}">
										<tr>
											<td>${linha.modalidade.codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;${linha.modalidade.descricao}</td>
											<td><strong>${mb_orcamento.valorPorNivelDespesa(3,linha)}</strong></td>
											<c:set var="CODIGO_BASE_MODALIDADE"
												value="${linha.modalidade.codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${NIVEL_GRUPO >= 4}">
								<c:if test="${OBJ_ELEMENTO != NULL}">
									<c:if test="${CODIGO_BASE_ELEMENTO != CODIGO_ELEMENTO}">
										<tr>
											<td>${linha.elemento.codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.elemento.descricao}</td>
											<td><strong>${mb_orcamento.valorPorNivelDespesa(4,linha)}</strong></td>
											<c:set var="CODIGO_BASE_ELEMENTO"
												value="${linha.elemento.codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
							<c:if test="${NIVEL_GRUPO >= 5}">
								<c:if test="${OBJ_SUBLEMENTO != NULL}">
									<c:if test="${CODIGO_BASE_SUBELEMENTO != CODIGO_SUBELEMENTO}">
										<tr>
											<td>${linha.subElemento.codigo}</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${linha.subElemento.descricao}</td>
											<td><strong>${linha.valorOrcado}</strong></td>
											<c:set var="CODIGO_BASE_SUBELEMENTO"
												value="${linha.subElemento.codigo}" />
										</tr>
									</c:if>
								</c:if>
							</c:if>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr>
							<th colspan="2">Total</th>
							<th colspan="1" class="text-right">${Total}</th>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>
	</div>
</div>

<%
	}
%>