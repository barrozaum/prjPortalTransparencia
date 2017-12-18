<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="mbUnidade" class="manager.ManagerUnidadeGestora"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form method="post"
	action="recursos/includes/cadastrar/cadastrar_assunto.php">
	<div class="well">
		<!-- div que coloca a cor no formulÃ¡rio -->
		<div class="panel panel-default">
			<!-- INICIO Dados do imÃ³vel -->
			<div class="panel-heading text-center">PESQUISA DESPESAS SUB
				FUNÇÃO</div>
			<div class="panel-body">
				<!-- inicio dados inscriÃ§Ã£o-->
				<div class="row">
					<div class="col-sm-6">
						<label for="id_dt_inicial">DATA INICIAL</label> <input
							class='form-control' type='text' name='txt_dt_inicial'
							id='id_dt_inicial' maxlength='8'
							onkeypress='return SomenteNumero(event)'
							onblur='return mascaraData(this)' /> <br />
					</div>
					<div class="col-sm-6">
						<label for="id_dt_final">DATA FINAL</label> <input
							class='form-control' type='text' name='txt_dt_final'
							id='id_dt_final' maxlength='8'
							onkeypress='return SomenteNumero(event)'
							onblur='return mascaraData(this)' /> <br />
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
						<label for="id_funcao">FUNÇÃO</label> <select name="name_funcao"
							id="id_funcao" class="form-control">
							<option value="">ESCOLHA A FUNÇÃO</option>
						</select><br />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label for="id_sub_funcao">SUB-FUNÇÃO</label> <select
							name="name_funcao" id="id_sub_funcao" class="form-control">
							<option value="">SELECIONE A FUNÇÃO</option>
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





