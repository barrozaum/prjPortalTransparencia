<?php
include_once '../conexao/conexao.php';
include_once '../funcao/function_letraMaiscula.php';
include_once '../funcao/funcaoCriacaoInput.php';
include_once '../funcao/func_unidade_gestora.php';


//meses
$array_competencia = array("1" => "MENSAL", "2" => "ANUAL", "3" => "PERIODO");
?>


<div class="well"><!-- div que coloca a cor no formulário -->
    <form  method="post" action="recursos/includes/cadastrar/cadastrar_assunto.php">    

        <div class="panel panel-default">
            <!-- INICIO Dados do imóvel -->
            <div class="panel-heading text-center">DEMONSTRATIVO DA RECEITA ARRECADADA POR PERÍODO</div>
            <div class="panel-body">
                <!-- inicio dados inscrição-->
                <div class="row">
                    <div class="col-sm-6">
                        <?php
                        criar_input_select("COMPETÊNCIA", "competencia", "competencia", array("required" => "true"), $array_competencia);
                        ?>
                    </div>
                </div> 
                <div class="row">
                    <div class="col-sm-12">
                        <div id="id_escolha_competencia">


                        </div>
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




