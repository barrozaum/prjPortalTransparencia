$(function () {
    //menu da pagina despesa
    $(document).on("click", "#link_lrf_despesa_pre_formatada", function (e) {
        e.preventDefault();
        $('#formulario').load('recursos/includes/formulario/formulario_despesa_fontes_recursos.jsp');
        $("#listar").html("");
    });

    $(document).on("click", "#link_lrf_despesa_pagas_periodo", function (e) {
        e.preventDefault();
        $('#formulario').load('recursos/includes/formulario/formulario_despesa_sub_funcao.jsp');
        $("#listar").html("");
    });

    $(document).on("click", "#link_lrf_despesa_detalhada", function (e) {
        e.preventDefault();
        $('#formulario').load('recursos/includes/formulario/formulario_lrf_despesa_detalhada.jsp');
        $("#listar").html("");
    });



    $(document).on("click", "#btn_lrf_pesquisa_detalhada", function (e) {
        e.preventDefault();

        var unidadeGestora = document.getElementById("id_unidade_gestora").value;
        var exercicio = document.getElementById("id_exercicio").value;
        var observacao = document.getElementById("id_observacao").value;

        if (unidadeGestora === "") {
            alert("Escolha a Unidade Gestora");
            return false;
        } else if (exercicio === "") {
            alert("Escolha o Exercicio");
            return false;
        }
        $("#listar").html('<div style="margin-top:50px; margin-left:50%"><img src="recursos/imagens/ajax-loader.gif" alt="carregando" title="carregando" width="20px"></div>');
        lrfDespesaDetalhada(unidadeGestora, exercicio, observacao);


    })
});


