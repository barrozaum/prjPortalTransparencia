<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="mbUnidade" class="manager.ManagerUnidadeGestora"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<form method="post"
	action="recursos/includes/cadastrar/cadastrar_assunto.php">
	<div class="well">
		<div class="panel panel-default">
			<!-- INICIO Dados do imÃ³vel -->
			<div class="panel-heading text-center">PESQUISA GRUPO DA
				DESPESA</div>
			<div class="panel-body">
				<!-- inicio dados inscriÃ§Ã£o-->
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
							<c:forEach items="${mbUnidade.getListaUnidadeGestora(null)}"
								var="linha">
								<option value="${linha.codUnidadeGestora}">${linha.descricaoUnidade}</option>
							</c:forEach>
						</select><br />
					</div>
				</div>
				


				<div class="row">
					<div class="col-sm-2">
						<br />
						<button type="button" class="btn btn-success"
							id="btn_despesa_grupo_despesa">
							PESQUISAR <span class="glyphicon glyphicon-search"></span>
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</form>


<!-- JQUERY PRA LISTAR OS EXERCICIOS -->
<script type="text/javascript" src="recursos/js/exercicioBase.js"></script>
<script type="text/javascript" src="recursos/js/orcamento/orcamentoDespesaGrupoDespesa.js"></script>





