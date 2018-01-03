$(function() {
	$(document)
			.on(
					"click",
					"#btn_orcamento_receita",
					function(e) {
						e.preventDefault();
						var exercicio = $("#id_exercicio").val();
						var nivelConta = $("#id_nivel_conta").val();
						var codigoUnidadeGestora = $("#id_unidade_gestora")
								.val();

						var msg_erro = "";
						// aplicando validação
						if (exercicio === "") {
							msg_erro = msg_erro + "EXERCICIO INVÁLIDO <BR />";
						}

						if (nivelConta === "") {
							msg_erro = msg_erro + "NÍVEL CONTA INVÁLIDA <BR />";
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

							function_pesquisas_orcamento_receita(exercicio,
									codigoUnidadeGestora, nivelConta);
						}
					});
});

function limpando_unidade_gestora() {

	$('#msg_erro').html('');
	$('#listar').html('');
	$('#id_unidade_gestora').empty();

}

function function_pesquisas_orcamento_receita(exercicio, codigoUnidadeGestora,
		nivelConta) {

	$
			.ajax({
				method : "POST",
				url : "recursos/includes/pesquisa/orcamento/receita/pesquisa_receita.jsp",
				data : {
					exercicio : exercicio,
					codigoUnidadeGestora : codigoUnidadeGestora,
					nivelConta : nivelConta
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
													title : 'ORCAMENTO-RECEITA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $(
																	'#id_descricao_unidade_gestora')
																	.val(),
													footer : true
												},

												{
													extend : 'excel',
													title : 'ORCAMENTO-RECEITA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $(
																	'#id_descricao_unidade_gestora')
																	.val(),
													footer : true
												},
												{
													extend : 'csv',
													title : 'ORCAMENTO-RECEITA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $(
																	'#id_descricao_unidade_gestora')
																	.val(),
													footer : true

												},
												{
													extend : 'pdfHtml5',
													title : 'ORCAMENTO-RECEITA_'
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
