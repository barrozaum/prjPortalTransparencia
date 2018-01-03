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

		mb_orcamento.pesquisaOrcamentoDespesaFonteRecurso(exercicio, codigoUnidadeGestora);
		Integer exercicioEscolhida = 0;
		String unidaGestoraEscolhida = "Nenhum Resultado Localizado";
		if (mb_orcamento.getOrcamentoFonteRecurso() != null) {
			exercicioEscolhida = mb_orcamento.getOrcamentoFonteRecurso().getExercicioOrcamento();
			unidaGestoraEscolhida = mb_orcamento.getOrcamentoFonteRecurso().getUnidadeGestora().getDescricaoUnidade();
		}
%>


<div class="col-sm-12 col-md-12 col-lg-12 ">
	<div class="panel panel-info">
		<div class="panel-heading">
			<div class="panel-title">Orçamento</div>
		</div>
		<div class="panel-body text-left">
			<table id="example" class="table table-hover table-striped">
				<thead>
					<tr>
						<th colspan="1">EXERCICIO</th>
						<th colspan="3">
							<%
								out.print(exercicioEscolhida);
							%>
						</th>
					</tr>
					<tr>
						<th colspan="1">Unidade Gestora</th>
						<th colspan="3"><input type="hidden"
							id="id_descricao_unidade_gestora"
							value="<%out.print(unidaGestoraEscolhida);%>"> <% out.print(unidaGestoraEscolhida);%>
						</th>
					</tr>
					<tr>
						<th>COD. RECURSO</th>
						<th>NOME RECURSOS</th>
						<th>VALOR ORÇADO</th>
					</tr>
				</thead>
				<tbody>
					<c:set var="Total" value="${0}" />
					<c:forEach
						items="${mb_orcamento.getListaOrcamentoDespesaFonteRecurso()}"
						var="linha">
						<c:set var="Total" value="${linha.valorTotalOrcado}" />
						<tr>
							<td>${linha.fonte.codigo}</td>
							<td>${linha.fonte.nome}</td>
							<td><strong>${linha.valorOrcado}</strong></td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<th colspan="2">Total</th>
						<th colspan="2" class="text-right">${Total}</th>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
</div>

<%
	}
%>

