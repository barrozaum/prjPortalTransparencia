<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="mbLrf" class="manager.ManagerLrf"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%
	Integer unidade = new Integer(request.getParameter("unidadeGestora"));
	Integer exercicio = new Integer(request.getParameter("exercicio"));
	String observacao = request.getParameter("observacao");
	mbLrf.carregarListaPesquisaDetalhada(exercicio, unidade, observacao);
%>
<div class="col-sm-12 col-md-12 col-lg-12 ">
	<div class="panel panel-info">
		<div class="panel-heading">
			<div class="panel-title">Empenhos</div>
		</div>
		<div class="panel-body">
			<div style="overflow: auto; max-width: 100%;">

				<table id="example" class="table table-hover table-striped">
					<thead>
						<tr>
							<th></th>
							<th>N° EMPENHO</th>
							<th>DATA</th>
							<th>CREDOR</th>
							<th>OBSERVACAO</th>
							<th>VALOR EMPENHADO</th>
							<th>VALOR LIQUIDADO</th>
							<th>VALOR PAGO</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${mbLrf.getListaPesquisaDetalhada()}"
							var="linha">
							<tr>
								<td align="center"><a href="#" id="editar"
									data-id="${linha.numeroEmpenho}"><img
										src="recursos/imagens/estrutura/lupa.png" height="20px;"
										alt="editar" title="consulta dados do processo"></a></td>
								<td>${linha.numeroEmpenho}</td>
								<td>${linha.dataEmpenho}</td>
								<td>${linha.nomeCredor}</td>
								<td>${linha.observacao}</td>
								<td>${linha.valorEmpenhado}</td>
								<td>${linha.valorLiquidado}</td>
								<td>${linha.valorPago}</td>
							</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr>
							<th></th>
							<th>N° EMPENHO</th>
							<th>DATA</th>
							<th>CREDOR</th>
							<th>OBSERVACAO</th>
							<th>VALOR EMPENHADO</th>
							<th>VALOR LIQUIDADO</th>
							<th>VALOR PAGO</th>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>
	</div>
</div>

