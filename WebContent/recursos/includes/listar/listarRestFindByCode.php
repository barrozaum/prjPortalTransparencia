<?php
$cod = $_POST['codigo'];



try {
    $endereço_ws_json = "http://34.208.42.129:8080/prjPortalContabilidade/webservice/bairro/listarCodigo/{$cod}";
    $json_file = file_get_contents($endereço_ws_json, true);

		$json = json_decode($json_file);
echo $json->codigo;
echo $json->descricao;

	

} catch (Exception $e) {
    echo $e->getMessage();
}
?>