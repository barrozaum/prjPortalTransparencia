$(function() {
	$(document).on('change', '#id_unidade_gestora', function(e) {

		
		var exercicio = $("#id_exercicio").val();
		var unidadeGestora = $("#id_unidade_gestora").val();

		// limpando 
		limpando_funcao();
		$('#id_funcao').html("<option value=''>CARREGANDO ... </option>");

		$.ajax({
			// Requisição pelo Method POST
			method : "POST",
			// url para o arquivo para validação
			url : "recursos/select/funcao/trocaFuncao.jsp",
			// dados para buscar
			data : {
				codigoUnidadeGestora : unidadeGestora,
				exercicio : exercicio
			},
			// função para de sucesso
			success : function(data) {
				$('#id_funcao').html(data);
			},
			error : function(error) {
				$('#msg_erro').html(error.responseText);
			}
		});// termina o ajax

	});
	$(document).on('change', '#id_funcao', function(e) {

		// especialidade escolhida
		var exercicio = $("#id_exercicio").val();
		var codigoUnidadeGestora = $("#id_unidade_gestora").val();
		var codigoFuncao = $("#id_funcao").val();

		// limpando medico
		$('#id_sub_funcao').empty();
		$('#id_sub_funcao').html("<option value=''>CARREGANDO ... </option>");

		$.ajax({
			// Requisição pelo Method POST
			method : "POST",
			// url para o arquivo para validação
			url : "recursos/select/subFuncao/trocaSubFuncao.jsp",
			// dados para buscar
			data : {
				exercicio : exercicio,
				codigoUnidadeGestora : codigoUnidadeGestora,
				codigoFuncao : codigoFuncao
			},
			// função para de sucesso
			success : function(data) {
				$('#id_sub_funcao').html(data);
			},
			error : function(error) {
				$('#msg_erro').html(error.responseText);
			}
		});// termina o ajax

	});
});