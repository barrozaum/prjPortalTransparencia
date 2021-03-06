$(function() {
	$(document)
			.on(
					"click",
					"#btn_despesa_unidade_orcamentaria",
					function(e) {
						e.preventDefault();
						var exercicio = $("#id_exercicio").val();
						var codigoUnidadeGestora = $("#id_unidade_gestora")
								.val();

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

							function_pesquisas_orcamento_despesa_unidade_orcamentaria(
									exercicio, codigoUnidadeGestora);
						}
					});
});

function limpando_unidade_gestora() {

	$('#msg_erro').html('');
	$('#listar').html('');
	$('#id_unidade_gestora').empty();

}

function function_pesquisas_orcamento_despesa_unidade_orcamentaria(exercicio,
		codigoUnidadeGestora) {

	$
			.ajax({
				method : "POST",
				url : "recursos/includes/pesquisa/orcamento/despesa/pesquisa_despesa_unidade_orcamentaria.jsp",
				data : {
					exercicio : exercicio,
					codigoUnidadeGestora : codigoUnidadeGestora
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
													title : 'ORCAMENTO-UNIDADE-EXECUTORA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $('#id_descricao_unidade_gestora').val(),
													footer : true
												},

												{
													extend : 'excel',
													title : 'ORCAMENTO-UNIDADE-EXECUTORA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $('#id_descricao_unidade_gestora').val(),
													footer : true
												},
												{
													extend : 'csv',
													title : 'ORCAMENTO-UNIDADE-EXECUTORA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $('#id_descricao_unidade_gestora').val(),
													footer : true

												},
												{
													extend : 'pdfHtml5',
													title : 'ORCAMENTO-UNIDADE-EXECUTORA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+ $('#id_descricao_unidade_gestora').val(),
													footer : true
												} ]

									});
				},
				error : function(erro) {
					$("#listar").html(erro);
				}

			});
}
