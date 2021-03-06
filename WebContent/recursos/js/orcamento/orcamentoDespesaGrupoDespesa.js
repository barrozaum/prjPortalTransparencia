$(function() {
	$(document)
			.on(
					"click",
					"#btn_despesa_grupo_despesa",
					function(e) {
						e.preventDefault();
						var exercicio = $("#id_exercicio").val();
						var codigoUnidadeGestora = $("#id_unidade_gestora")
								.val();
						var nivelGrupo = $("#id_nivel_grupo").val();

						var msg_erro = "";
						// aplicando validação
						if (exercicio === "") {
							msg_erro = msg_erro + "EXERCICIO INVÁLIDO <BR />";
						}

						if(nivelGrupo ===""){
							msg_erro = msg_erro + "NÍVEL GRUPO INVÁLIDO <BR />";
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

							function_pesquisas_orcamento_despesa_grupo_despesa(
									exercicio, nivelGrupo, codigoUnidadeGestora);
						}
					});
});

function limpando_unidade_gestora() {

	$('#msg_erro').html('');
	$('#listar').html('');
	$('#id_unidade_gestora').empty();

}

function function_pesquisas_orcamento_despesa_grupo_despesa(exercicio,nivelGrupo,
		codigoUnidadeGestora) {

	$
			.ajax({
				method : "POST",
				url : "recursos/includes/pesquisa/orcamento/despesa/pesquisa_despesa_grupo_despesa.jsp",
				data : {
					exercicio : exercicio,
					codigoUnidadeGestora : codigoUnidadeGestora,
					nivelGrupo : nivelGrupo
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
													title : 'ORCAMENTO-DESPESA-GRUPO-DESPESA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+  $('#id_descricao_unidade_gestora').val(),
													footer : true
												},

												{
													extend : 'excel',
													title : 'ORCAMENTO-DESPESA-GRUPO-DESPESA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+  $('#id_descricao_unidade_gestora').val(),
													footer : true
												},
												{
													extend : 'csv',
													title : 'ORCAMENTO-DESPESA-GRUPO-DESPESA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+  $('#id_descricao_unidade_gestora').val(),
													footer : true

												},
												{
													extend : 'pdfHtml5',
													title : 'ORCAMENTO-DESPESA-GRUPO-DESPESA_'
															+ exercicio,
													messageTop : 'Unidade Gestora '
															+  $('#id_descricao_unidade_gestora').val(),
													footer : true
												} ]

									});
				},
				error : function(erro) {
					$("#listar").html(erro);
				}

			});
}
