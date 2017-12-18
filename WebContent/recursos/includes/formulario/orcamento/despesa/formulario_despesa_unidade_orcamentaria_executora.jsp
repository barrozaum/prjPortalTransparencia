<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="mbUnidade" class="manager.ManagerUnidadeGestora"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form method="post"
	action="recursos/includes/cadastrar/cadastrar_assunto.php">
	<div class="well">
		<div class="panel panel-default">
			<div class="panel-heading text-center">ORÇAMENTO - DESPESA -
				UNIDADE ORÇAMENTÁRIA E EXECUTORA</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-sm-6">
						<label for="id_exercicio">Exercício</label> <select
							name="name_exercicio" id="id_exercicio" class="form-control">
							<option value="">SELECIONE O EXERCÍCIO</option>
							<option value="2015">2015</option>
						</select><br />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label for="id_unidade_gestora">UNIDADE GESTORA</label> <select
							name="name_unidade_gestora" id="id_unidade_gestora"
							class="form-control">
							<option value="">ESCOLHA A UNIDADE GESTORA</option>
							<c:forEach items="${mbUnidade.findAllUnidadeGestora()}"
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
							id="btn_despesa_fonte_recurso">
							PESQUISAR <span class="glyphicon glyphicon-search"></span>
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</form>





