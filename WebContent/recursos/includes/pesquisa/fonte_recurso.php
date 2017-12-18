<?php
$ano = $_REQUEST['ano'];
$receita = $_REQUEST['receita'];

/*
  $dtInicial = $_REQUEST['dtInicial'];

  if(empty($_REQUEST['dtInicial']))
  $dtInicial = "01/01";
  else
  $dtInicial = $_REQUEST['dtInicial'];


  if(empty($_REQUEST['dtFinal']))
  $dtFinal = "01/01";
  else
  $dtFinal = $_REQUEST['dtFinal'];


  $partes_data_Final = explode("/", $dtFinal);
  $dtFinal = $ano ."-". $partes_data_Final[1] ."-" . $partes_data_Final[0];

  $partes_data_Inicial = explode("/", $dtInicial);
  $dtInicial =  $ano ."-". $partes_data_Inicial[1] ."-" . $partes_data_Inicial[0];
 */
?>


<?php

function obtemVrPrevisto($conexao, $unidadeGestora) {

    $sql = "select coalesce(sum(vr_previsto),0.0) as vr_previsto " .
            "from receita " .
            "where codigo = {$unidadeGestora} " .
            "and   ano     = 2011 ";


//echo $sql;

    $resultado = $conexao->query($sql);

    $vr_previsto = $resultado->fetch_assoc();

    return $vr_previsto['vr_previsto'];
}
?>

<!DOCTYPE html>
<html>
    <head>
        <title>Portal Trânsparencia</title>
        <meta charset="utf-8">
        <link rel="shortcut icon" href="recursos/imagens/orcamento.png" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script>
            $(document).ready(function () {
                $('#table').DataTable();
            });
        </script>


    </head>
    <body>
        <h3>Período Consultado: Exercício de <?php echo $ano; ?></h3> 
        <hr />
        <div id="resultadoPesquisa">
            <table id="table" class="display" cellspacing="0" width="100%">
                <thead>
                    <tr>
                        <th>Cód Recurso </th>
                        <th>Descrição</th>
                        <th>Valor Orçado</th>
                    </tr>
                </thead>
                <tbody>

                    <?php
                    include_once './../estrutura/conexao.php';
                    $sql = "SELECT * FROM unidade u WHERE u.ano = 2011  LIMIT 1, 10";

                    $resultado = $conexao->query($sql);
                    while ($dados = $resultado->fetch_assoc()) {
                        ?>
                        <?php $vrPrevisto = obtemVrPrevisto($conexao, $dados['codigo']); ?>



                        <tr onclick="mudaPagina(1,<?php echo $dados['codigo_orgao']; ?>)">
                            <td><?php echo $dados['cod_unidadegestora']; ?></td>
                            <td><?php echo $dados['descricao']; ?></td>
                            <td><?php echo $vrPrevisto; ?></td>
                        </tr>


                        <?php
                    }
                    $conexao->close();
                    ?>
                </tbody>
                <tfoot>
                    <tr>
                        <th>Cód Recurso </th>
                        <th>Descrição</th>
                        <th>Valor Orçado</th>
                    </tr>
                </tfoot>
            </table>
        </div>
    </body>
</html>

