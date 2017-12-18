function limpando_unidade_gestora() {

	$('#msg_erro').html('');
	$('#listar').html('');
	$('#id_unidade_gestora').empty();

	$('#id_funcao').empty();
	$('#id_funcao').html("<option value=''>SELECIONE UNIDADE GESTORA</option>");

	$('#id_sub_funcao').empty();
	$('#id_sub_funcao').html("<option value=''>SELECIONE A FUNÇÃO</option>");

}

function limpando_funcao() {
	$('#msg_erro').html('');
	$('#listar').html('');
	$('#id_funcao').empty();

	$('#id_sub_funcao').empty();
	$('#id_sub_funcao').html("<option value=''>SELECIONE A FUNÇÃO</option>");
}

function function_pesquisas_orcamento_despesa_subfuncao(exercicio, codigoUnidadeGestora,
		codigoFuncao, codigoSubFuncao) {

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
					$('#example').DataTable({
						dom : 'Bfrtip',
						buttons : [ 'copy', 'csv', 'excel', 'pdf', 'print' ]
					});
				},
				error : function(erro) {
					$("#listar").html(erro);
				}

			});
}
