<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <title>Portal Trânsparencia</title>
        <meta charset="utf-8">
        <link rel="shortcut icon" href="recursos/imagens/orcamento.png" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css">
        <link href="recursos/css/bootstrap.css" rel="stylesheet">
        <link href="recursos/css/menu.css" rel="stylesheet">
        <script src="recursos/js/jquery.min.js"></script>
        <script src="recursos/js/bootstrap.min.js"></script>
        <link rel="apple-touch-icon" href="/bootstrap/img/apple-touch-icon.png">
        <link rel="apple-touch-icon" sizes="72x72" href="/bootstrap/img/apple-touch-icon-72x72.png">
        <link rel="apple-touch-icon" sizes="114x114" href="/bootstrap/img/apple-touch-icon-114x114.png">
        <script src="recursos/js/estrutura.js"></script>
        <script type='text/javascript'>
            $(document).ready(function () {
                inicialConteudo();
            });

            function inicialConteudo() {
                $('#conteudo_e_sci_1').load('recursos/includes/estrutura/ini_esic.html');
                $('#conteudo_sic_2').load('recursos/includes/estrutura/ini_esic.html');
                $('#conteudo_2').load('recursos/includes/estrutura/ini_cont_menu.html');
                $('#conteudo_sic1').load('recursos/includes/formulario/esic_form1.html');
                $('#conteudo_sic2').load('recursos/includes/estrutura/esic_Frequentes.html');
                $('#modal').load('recursos/includes/estrutura/modal.html');
            }

            // chamada da página esic.html
            $(document).on('click', '#acessar-esic', function () {
                location.href = "esic.html";
            });

            // chamada da página esic.html

            $(document).on('mouseOver', '#orcamento', function () {
                location.href = "esic.html";
            });
        </script>
    </head>
    <body>
        <div id="cabecalho"> 
            <!-- Não apagar, pois é onde encontra-se o cabecalho do site -->
        </div>  
        <div class="container bg-4 "> 
            <div class="alert alert-success text-center">
            	<h3 class="h3">Bem Vindo !!!</h3>
            </div> 
            <div class="well text-center">
                <div style="overflow:auto; max-height:285px; background-color:">
                    <p> O objetivo do Portal da Transparência é assegurar a boa e correta aplicação dos recursos públicos referentes a todos os órgãos e entidades do poder executivo municipal – administração direta, autarquias e fundações aumentando a transparência da gestão pública, permitindo que o cidadão acompanhe como o dinheiro público está sendo utilizado e ajude a fiscalizar.</p>
                </div>
            </div>
        </div>
        <hr />
        <div id="conteudo_1">
            <!-- Não apagar, pois é onde encontra-se o conteudo do E-SIC  da página -->
        </div>

        <div id="conteudo_2">
            <!-- Não apagar, pois é onde encontra-se o conteudo dos Links da prestação de contas da página -->
        </div>
        <hr />
        <div class="container bg-4 "> 
            <div class="row">
                <h3 style="text-align:center">SISTEMA ELETRÔNICO DE INFORMAÇÃO AO CIDADÃO </h3>
                <div id="conteudo_sic1">

                </div>
                <div id="conteudo_sic2">

                </div>
            </div>
        </div><br>  

        <div id="modal"></div>
        <div id="rodape"></div>
    </body>
</html>
