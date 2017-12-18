$(function() {
	
	$(document).on("change", "#id_exercicio", function(e) {
		e.preventDefault();

		var exercicio = $("#id_exercicio").val();

		limpando_unidade_gestora();
		$('#id_unidade_gestora').html("<option value=''>CARREGANDO ... </option>");

		$.ajax({
			method : "post",

			url : "recursos/select/unidadeGestora/trocaUnidadeGestora.jsp",
			data : {
				exercicio : exercicio
			},
			success : function(data) {
				$('#id_unidade_gestora').html(data);
			},
			error : function(error) {
				$('#msg_erro').html(error.responseText);
			}
		});
	});

});