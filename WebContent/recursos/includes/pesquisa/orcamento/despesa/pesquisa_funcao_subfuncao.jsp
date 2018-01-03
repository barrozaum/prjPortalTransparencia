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
		Integer codigoFuncao = 0;
		Integer codigoSubFuncao = 0;

		if (!request.getParameter("codigoFuncao").equals("")) {
			codigoFuncao = new Integer(request.getParameter("codigoFuncao"));
		}

		if (!request.getParameter("codigoSubFuncao").equals("")) {
			codigoSubFuncao = new Integer(request.getParameter("codigoSubFuncao"));
		}

		mb_orcamento.pesquisaOrcamentoDespesaFuncaoSubFuncao(exercicio, codigoUnidadeGestora, codigoFuncao,
				codigoSubFuncao);
		Integer exercicioEscolhida = 0;
		String unidaGestoraEscolhida = "Nenhum Resultado Localizado";
		if (mb_orcamento.getOrcamentoDespesaFuncaoSubFuncao() != null) {
			exercicioEscolhida = mb_orcamento.getOrcamentoDespesaFuncaoSubFuncao().getExercicioOrcamento();
			unidaGestoraEscolhida = mb_orcamento.getOrcamentoDespesaFuncaoSubFuncao().getUnidadeGestora()
					.getDescricaoUnidade();
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
						<th colspan="4">
							<%
									out.print(exercicioEscolhida);
								%>
						</th>
					</tr>
					<tr>
						<th colspan="1">Unidade Gestora</th>
						<th colspan="4"><input type="hidden"
							id="id_descricao_unidade_gestora"
							value="<%out.print(unidaGestoraEscolhida);%>"> <% out.print(unidaGestoraEscolhida);%>
						</th>
					</tr>
					<tr>
						<th>COD. FUNÇÃO</th>
						<th>DESC. FUNÇÃO</th>
						<th>COD. SUBFUNÇÃO</th>
						<th>DESC. SUBFUNÇÃO</th>
						<th>VALOR ORÇADO</th>
					</tr>
				</thead>
				<tbody>
					<c:set var="Total" value="${0}" />
					<c:forEach
						items="${mb_orcamento.getListaOrcamentoDespesaFuncaoSubFuncao()}"
						var="linha">
						<c:set var="Total" value="${linha.valorTotalOrcado}" />
						<tr>
							<td>${linha.funcao.codigo}</td>
							<td>${linha.funcao.descricao}</td>
							<td>${linha.subFuncao.codigo}</td>
							<td>${linha.subFuncao.descricao}</td>
							<td><strong>${linha.valor}</strong></td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<th colspan="3">Total</th>
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