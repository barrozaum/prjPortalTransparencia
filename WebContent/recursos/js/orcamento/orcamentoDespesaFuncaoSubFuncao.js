$(function() {
	$(document)
			.on(
					"click",
					"#btn_orcamento_despesa_sub_funcao",
					function(e) {
						e.preventDefault();
						var exercicio = $("#id_exercicio").val();
						var codigoUnidadeGestora = $("#id_unidade_gestora")
								.val();
						var codigoFuncao = $("#id_funcao").val();
						var codigoSubFuncao = $("#id_sub_funcao").val();

						var msg_erro = "";
						// aplicando validação
						if (exercicio === "") {
							msg_erro = msg_erro + "EXERCICIO INVÁLIDO <BR />";
						}
						if (codigoUnidadeGestora === "") {
							msg_erro = msg_erro
									+ "UNIDADE GESTORA INVÁLIDA <BR />";
						}

						if (msg_erro !== "") {
							$("#msg_erro").html(
									'<div class="alert alert-danger">'
											+ msg_erro + '</div>');
						} else {
							$("#msg_erro").html('');
							$("#listar")
									.html(
											'<img src="recursos/imagens/ajax-loader.gif" alt="carregando" title="carregando" width="20px">');

							function_pesquisas_orcamento_despesa_subfuncao(
									exercicio, codigoUnidadeGestora,
									codigoFuncao, codigoSubFuncao);
						}
					});
});

function limpando_unidade_gestora() {

	$('#msg_erro').html('');
	$('#listar').html('');
	$('#id_unidade_gestora').empty();

	$('#id_funcao').empty();
	$('#id_funcao').html("<option value=''>SELECIONE UNIDADE GESTORA</option>");

}

function limpando_funcao() {
	$('#msg_erro').html('');
	$('#listar').html('');
	$('#id_funcao').empty();

	$('#id_sub_funcao').empty();
	$('#id_sub_funcao').html("<option value=''>SELECIONE A FUNÇÃO</option>");
}

function function_pesquisas_orcamento_despesa_subfuncao(exercicio,
		codigoUnidadeGestora, codigoFuncao, codigoSubFuncao) {

	$
			.ajax({
				method : "POST",
				url : "recursos/includes/pesquisa/orcamento/despesa/pesquisa_funcao_subfuncao.jsp",
				data : {
					exercicio : exercicio,
					codigoUnidadeGestora : codigoUnidadeGestora,
					codigoFuncao : codigoFuncao,
					codigoSubFuncao : codigoSubFuncao
				},
				success : function(sucesso) {
					$("#listar").html(sucesso);
					$('#example')
							.DataTable(
									{
										responsive : true,
										dom : 'Bfrtip',
										buttons : [
												'copy',
												{
													extend : 'print',
													title : 'ORCAMENTO-DESPESA-FUNCAO-SUBFUNCAO_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $(
																	'#id_descricao_unidade_gestora')
																	.val(),
													footer : true
												},

												{
													extend : 'excel',
													title : 'ORCAMENTO-DESPESA-FUNCAO-SUBFUN_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $(
																	'#id_descricao_unidade_gestora')
																	.val(),
													footer : true
												},
												{
													extend : 'csv',
													title : 'ORCAMENTO-DESPESA-FUNCAO-SUBFUNCAO_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $(
																	'#id_descricao_unidade_gestora')
																	.val(),
													footer : true

												},
												{
													extend : 'pdfHtml5',
													title : 'ORCAMENTO-DESPESA-FUNCAO-SUBFUNCAO_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $(
																	'#id_descricao_unidade_gestora')
																	.val(),
													footer : true
												} ]

									});
				},
				error : function(erro) {
					$("#listar").html(erro);
				}

			});
}
