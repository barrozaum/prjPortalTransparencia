<jsp:useBean id="mbLrf" class="manager.ManagerLrf"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%
    Integer unidade = new Integer(request.getParameter("unidadeGestora"));
    String observacao = request.getParameter("observacao");
    mbLrf.carregarListaPesquisaDetalhada(2017, unidade, observacao);
%>


<script>
    $(document).ready(function() {
        $('#tblExport').DataTable();
    });
</script>
<div class="col-sm-12 col-md-12 col-lg-12 ">
	<div class="panel panel-info">
		<div class="panel-heading">
			<div class="panel-title">Empenhos</div>
		</div>
		<div class="panel-body">
			<div style="overflow: auto; max-width: 100%;">
				<table id="tblExport" class="table table-hover table-striped">
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
						<c:set var="Total" value="${1}" />
						<c:forEach items="${mbLrf.getListaPesquisaDetalhada()}"
							var="linha">
							<c:set var="Total" value="${Total + 1}" />
							<tr>
								<td align="center"><a href="#" id="editar"
									data-id="${linha.numeroEmpenho}"><img
										src="recursos/imagens/estrutura/lupa.png" height="20px;"
										alt="editar" title="consulta dados do processo"></a></td>
								<th>${linha.numeroEmpenho}</th>
								<th>${linha.dataEmpenho}</th>
								<th>${linha.nomeCredor}</th>
								<th>${linha.observacao}</th>
								<th>${linha.valorEmpenhado}</th>
								<th>${linha.valorLiquidado}</th>
								<th>${linha.valorPago}</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
total ${Total}
<button id="btnExport">Export to excel</button>


