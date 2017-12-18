function limpando_unidade_gestora() {

	$('#msg_erro').html('');
	$('#listar').html('');
	$('#id_unidade_gestora').empty();

	
}


function function_pesquisas_orcamento_despesa_fonte_recurso(exercicio, codigoUnidadeGestora) {

	$
			.ajax({
				method : "POST",
				url : "recursos/includes/pesquisa/orcamento/despesa/pesquisa_fonte_recurso.jsp",
				data : {
					exercicio : exercicio,
					codigoUnidadeGestora : codigoUnidadeGestora
					},
				success : function(sucesso) {
					$("#listar").html(sucesso);
					$('#example').DataTable({
						responsive: true,
						dom : 'Bfrtip',
						buttons : [ 
							'copy', 'print' ,
							{
				                extend: 'excel',
				                title: 'ORCAMENTO-DESPESA-FONTE-RECURSO_'+exercicio
				            },
							{
				                extend: 'csv',
				                title: 'ORCAMENTO-DESPESA-FONTE-RECURSO_'+exercicio
				            },
				            {
				                extend: 'pdf',
				                title: 'ORCAMENTO-DESPESA-FONTE-RECURSO_'+exercicio
				            }
							]
						
					});
				},
				error : function(erro) {
					$("#listar").html(erro);
				}

			});
}
