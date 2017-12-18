<?php
include_once '../conexao/conexao.php';
include_once '../funcao/function_letraMaiscula.php';
include_once '../funcao/funcaoCriacaoInput.php';
include_once '../funcao/func_unidade_gestora.php';



//meses
$array_meses = array("0" => "SELECIONE O MES", "1" => "JANEIRO", "2" => "FEVEREIRO", "3" => "MARÇO", "4" => "ABRIL", "5" => "MAIO", "6" => "JUNHO", "7" => "JULHO", "8" => "AGOSTO", "9" => "SETEMBRO", "10" => "OUTUBRO", "11" => "NOVEMBRO", "12" => "DEZEMBRO");
$array_origem= array("0" => "RECEBIDOS DO ESTADO", "1" => "RECEBIDOS DA UNIÃO");
?>


<div class="well"><!-- div que coloca a cor no formulário -->
    <form  method="post" action="recursos/includes/cadastrar/cadastrar_assunto.php">    

        <div class="panel panel-default">
            <!-- INICIO Dados do imóvel -->
            <div class="panel-heading text-center">Convênios Recebidos da União / do Estado</div>
            <div class="panel-body">
                <!-- inicio dados inscrição-->
                <div class="row">
                    <div class="col-sm-6">
                        <?php
                        criar_input_select("ORIGEM", "origem_receita", "origem_receita", array("required" => "true"), $array_origem);
                        ?>
                    </div>
                </div> 
              <div class="row">
                    <div class="col-sm-6">
                        <?php
                        criar_input_select("mes", "mes", "mes", array("required" => "true"), $array_meses);
                        ?>
                    </div>
                    <div class="col-sm-6">
                        <?php
                        criar_input_select("ANO", "ano", "ano", array("required" => "true"), array('0' => "ESCOLHA ANO", "2015" => "2015"));
                        ?>
                    </div>
                </div> 

                <div class="row">
                    <div class="col-sm-12">
                        <?php
                        criar_input_select("ORGÃO", "orgao", "orgao", array("required" => "true"), funcBuscarUnidadeGestora($pdo));
                        ?>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-2">
                        <br /><button type="button" class="btn btn-success" id="btn_despesa_fonte_recurso">PESQUISAR <span class="glyphicon glyphicon-search"></span></button>
                    </div>
                </div>
            </div>
        </div>

    </form>
</div>




