function limpando_unidade_gestora(){
	
	$('#id_unidade_gestora').empty();
	$('#id_observacao').val("");
}


function  lrfDespesaDetalhada(unidadeGestora, exercicio, observacao) {

    $.ajax({
        method: "POST",
        url: "recursos/includes/pesquisa/lrf/pesquisa_despesa_detalhada.jsp",
        data: {unidadeGestora: unidadeGestora, exercicio: exercicio, observacao: observacao},
        success: function (sucesso) {
            $("#listar").html(sucesso);
            $('#example').DataTable( {
                dom: 'Bfrtip',
                buttons: [
                    'copy', 'csv', 'excel', 'pdf', 'print'
                ]
            } );
        }, error: function (erro) {
            $("#listar").html(erro);
        }

    });
}