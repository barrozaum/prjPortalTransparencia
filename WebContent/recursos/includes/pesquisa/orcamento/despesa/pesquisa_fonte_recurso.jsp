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
%>


<div class="col-sm-12 col-md-12 col-lg-12 ">
	<div class="panel panel-info">
		<div class="panel-heading">
			<div class="panel-title">Orçamento</div>
		</div>
		<div class="panel-body text-center">
			<div style="overflow: auto; max-width: 100%;">

				<table id="example" class="table table-hover table-striped">
					<thead>
						<tr>
							<th>EXERCICIO</th>
							<th>COD. RECURSO</th>
							<th>NOME RECURSOS</th>
							<th>VALOR ORÇADO</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="Total" value="${0}" />
						<c:forEach items="${mb_orcamento.getListaOrcamentoFonteRecurso()}"
							var="linha">
							<c:set var="Total" value="${linha.valorTotalOrcado}" />
							<tr>
								<td>${linha.exercicioOrcamento}</td>
								<td>${linha.fonte.codigo}</td>
								<td>${linha.fonte.nome}</td>
								<td>${linha.valorOrcado}</td>
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
</div>

<%
	}
%>

