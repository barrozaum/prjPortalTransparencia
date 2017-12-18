$(function() {
	// menu da pagina despesa
	$(document)
			.on(
					"click",
					"#link_orcamento_receita_prevista",
					function(e) {
						e.preventDefault();
						$("#msg_erro").html("");
						$("#formulario")
								.html(
										'<img src="recursos/imagens/ajax-loader.gif" alt="carregando" title="carregando" width="20px">');

						$('#formulario')
								.load(
										'recursos/includes/formulario/orcamento/receita/formulario_receita.jsp');
						$("#listar").html("");
					});
	$(document)
			.on(
					"click",
					"#link_orcamento_despesa_fontes_recursos",
					function(e) {
						e.preventDefault();
						$("#msg_erro").html("");
						$("#formulario")
								.html(
										'<img src="recursos/imagens/ajax-loader.gif" alt="carregando" title="carregando" width="20px">');

						$('#formulario')
								.load(
										'recursos/includes/formulario/orcamento/despesa/formulario_despesa_fontes_recursos.jsp');
						$("#listar").html("");
					});
	$(document)
			.on(
					"click",
					"#link_orcamento_despesa_funcao_subFuncao",
					function(e) {
						e.preventDefault();
						$("#msg_erro").html("");
						$("#formulario")
								.html(
										'<img src="recursos/imagens/ajax-loader.gif" alt="carregando" title="carregando" width="20px">');

						$('#formulario')
								.load(
										'recursos/includes/formulario/orcamento/despesa/formulario_despesa_sub_funcao.jsp');
						$("#listar").html("");
					});
	$(document)
			.on(
					"click",
					"#link_orcamento_despesa_grupo_despesa",
					function(e) {
						e.preventDefault();
						$("#msg_erro").html("");
						$("#formulario")
								.html(
										'<img src="recursos/imagens/ajax-loader.gif" alt="carregando" title="carregando" width="20px">');

						$('#formulario')
								.load(
										'recursos/includes/formulario/orcamento/despesa/formulario_despesa_grupo_despesa.jsp');
						$("#listar").html("");
					});

	$(document)
			.on(
					"click",
					"#link_orcamento_despesa_programa_acao",
					function(e) {
						e.preventDefault();
						$("#msg_erro").html("");
						$("#formulario")
								.html(
										'<img src="recursos/imagens/ajax-loader.gif" alt="carregando" title="carregando" width="20px">');

						$('#formulario')
								.load(
										'recursos/includes/formulario/orcamento/despesa/formulario_despesa_programa_acao.jsp');
						$("#listar").html("");
					});

	$(document)
			.on(
					"click",
					"#link_orcamento_despesa_unidade_orcamentaria",
					function(e) {
						e.preventDefault();
						$("#msg_erro").html("");
						$("#formulario")
								.html(
										'<img src="recursos/imagens/ajax-loader.gif" alt="carregando" title="carregando" width="20px">');

						$('#formulario')
								.load(
										'recursos/includes/formulario/orcamento/despesa/formulario_despesa_unidade_orcamentaria_executora.jsp');
						$("#listar").html("");
					});

	// AÇÕES DOS FORMULARIOS
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
	
	$(document)
	.on(
			"click",
			"#btn_orcamento_despesa_fonte_recurso",
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

					function_pesquisas_orcamento_despesa_fonte_recurso(
							exercicio, codigoUnidadeGestora);
				}
			});
});
