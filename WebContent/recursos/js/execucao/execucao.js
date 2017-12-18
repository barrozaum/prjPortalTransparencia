$(function () {
    //menu da pagina despesa
    $(document).on("click", "#link_execucao_despesa_fontes_recursos", function (e) {
        e.preventDefault();
        $('#formulario').load('recursos/includes/formulario/formulario_despesa_fontes_recursos.jsp');
        $("#listar").html("");
    });

    $(document).on("click", "#link_execucao_despesa_funcao_subFuncao", function (e) {
        e.preventDefault();
        $('#formulario').load('recursos/includes/formulario/formulario_despesa_sub_funcao.jsp');
        $("#listar").html("");
    });

   
    
});


