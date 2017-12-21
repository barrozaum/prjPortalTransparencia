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
	
	
});
