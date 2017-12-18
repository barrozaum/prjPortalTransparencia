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
							<c:forEach items="${mbUnidade.findAllUnidadeGestora()}"
								var="linha">
								<option value="${linha.codUnidadeGestora}">${linha.descricaoUnidade}</option>
							</c:forEach>
						</select><br />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label for="id_categoria">CATEGORIA</label> <select
							name="name_categoria" id="id_categoria" class="form-control">
							<option value="">SELECIONE A UNIDADE GESTORA</option>
						</select><br />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label for="id_natureza">NATUREZA</label> <select
							name="name_natureza" id="id_natureza" class="form-control">
							<option value="">SELECIONE A CATEGORIA</option>
						</select><br />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label for="id_modalidade">MODALIDADE</label> <select
							name="name_modalidade" id="id_modalidade" class="form-control">
							<option value="">SELECIONE A NATUREZA</option>
						</select><br />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label for="id_elemento">ELEMENTO</label> <select
							name="name_elemento" id="id_elemento" class="form-control">
							<option value="">SELECIONE A MODALIDADE</option>
						</select><br />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label for="id_sub_elemento">SUB-ELEMENTO</label> <select
							name="name_sub_elemento" id="id_sub_elemento"
							class="form-control">
							<option value="">SELECIONE O ELEMENTO</option>
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





