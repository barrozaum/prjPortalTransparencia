<?php
$nome = $_POST['nome'];
$codigo = $_POST['codigo'];
echo $nome ."-". $codigo; 
try {
    $endereço_ws_json = "http://localhost:8089/prjPortalContabilidade/webservice/bairro/listarCodigo/1";
    $json_file = file_put_contents($endereço_ws_json, true);
    echo $json_file;
    echo "<hr>";
} catch (Exception $e) {
    echo $e->getMessage();
}
?>