<jsp:useBean id="mbUnidade" class="manager.ManagerUnidadeGestora"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="well">
	<div class="panel panel-default">
		<div class="panel-heading text-center">Despesa Detalhada</div>
		<div class="panel-body">
			<div class="row">
				<div class="col-sm-6">
					<div id="select_exercicio"></div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					<label for="id_unidade_gestora">UNIDADE GESTORA</label> <select
						name="name_unidade_gestora" id="id_unidade_gestora"
						class="form-control">
						<option value="">ESCOLHA A UNIDADE GESTORA</option>
						<c:forEach items="${mbUnidade.getListaUnidadeGestora(2016)}"
							var="linha">
							<option value="${linha.codUnidadeGestora}">${linha.descricaoUnidade}</option>
						</c:forEach>
					</select><br />
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					<label for="observacao">Observação</label> <input type="text"
						name="observacao" id="id_observacao" maxlength="30"
						class="form-control" value="" placeholder="Digite texto"
						onkeypress="doNothing()"><br />
				</div>
			</div>
			<div class="row">
				<div class="col-sm-2">
					<br />
					<button type="button" class="btn btn-success"
						id="btn_lrf_pesquisa_detalhada">
						PESQUISAR <span class="glyphicon glyphicon-search"></span>
					</button>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" src="recursos/js/exercicioBase.js"></script>
<script type="text/javascript" src="recursos/js/lrf/lrfDespesaDetalhada.js"></script>
