<?php
include_once '../conexao/conexao.php';
include_once '../funcao/function_letraMaiscula.php';
include_once '../funcao/funcaoCriacaoInput.php';
include_once '../funcao/func_unidade_gestora.php';
?>




<form  method="post" action="recursos/includes/cadastrar/cadastrar_assunto.php">    
    <div class="well"><!-- div que coloca a cor no formulário -->
        <div class="panel panel-default">
            <!-- INICIO Dados do imóvel -->
            <div class="panel-heading text-center">PESQUISA DESPESAS POR PROGRAMAS E AÇÕES</div>
            <div class="panel-body">
                <!-- inicio dados inscrição-->
                <div class="row">
                    <div class="col-sm-6">
                        <?php
                        criar_input_data('Data Inicial', 'dt_inicial', 'dt_inicial', array('required' => 'true', 'placeholder' => '00/00/0000'), '', 'somente numeros');
                        ?>
                    </div>
                    <div class="col-sm-6">
                        <?php
                        criar_input_data('Data Final', 'dt_final', 'dt_final', array('required' => 'true', 'placeholder' => '00/00/0000'), date('d/m/Y'), 'somente numeros');
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
                    <div class="col-sm-12">
                        <?php
                        criar_input_select("UNIDADE ORÇAMENTARIA", "orcamentaria", "orcamentaria", array("required" => "true"),  array("" => "SELECIONE O ORGAO"));
                        ?>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <?php
                        criar_input_select("UNIDADE EXECUTORA", "executora", "executora", array("required" => "true"), array("" => "SELECIONE A UNIDADE ORCAMENTARIA"));
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
    </div>
</form>





