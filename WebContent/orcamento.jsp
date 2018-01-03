<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Portal Trânsparencia</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- estrutura -->
<link href="recursos/css/bootstrap.css" rel="stylesheet">
<link href="recursos/css/menu.css" rel="stylesheet">
<script src="recursos/js/jquery.min.js"></script>
<script src="recursos/js/bootstrap.min.js"></script>
<script src="recursos/js/estrutura.js"></script>

<!-- tabela -->
<link rel="shortcut icon" type="image/png"
	href="/media/images/favicon.png">
<link rel="alternate" type="application/rss+xml" title="RSS 2.0"
	href="http://www.datatables.net/rss.xml">
<link rel="stylesheet" type="text/css"
	href="/media/css/site-examples.css?_=758e23b3f1a4c34d6c055f5cc10bae7e">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/buttons/1.4.2/css/buttons.dataTables.min.css">
<style type="text/css" class="init"></style>

<script type="text/javascript" src="recursos/js/dataTable/jquery-1.12.4"></script>
<script type="text/javascript"
	src="recursos/js/dataTable/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="recursos/js/dataTable/dataTables.buttons.min.js"></script>
<script type="text/javascript"
	src="recursos/js/dataTable/buttons.flash.min.js"></script>
<script type="text/javascript" src="recursos/js/dataTable/jszip.min.js"></script>
<script type="text/javascript"
	src="recursos/js/dataTable/pdfmake.min.js"></script>
<script type="text/javascript" src="recursos/js/dataTable/vfs_fonts.js"></script>
<script type="text/javascript"
	src="recursos/js/dataTable/buttons.html5.min.js"></script>
<script type="text/javascript"
	src="recursos/js/dataTable/buttons.print.min.js"></script>

<!-- Includes para Colocar o Calendário na data -->
<link rel="stylesheet"
	href="recursos/css/redmond/jquery-ui-1.10.1.custom.css" />
<script src="recursos/js/data_calendario.js" type="text/javascript"></script>
<script src="recursos/js/calendario.js" type="text/javascript"></script>
<script src="recursos/js/mascaraData.js"></script>

<!-- Auxiliares -->
<script src="recursos/js/orcamento/orcamento.js"></script>
<script type="text/javascript" src="recursos/js/trocarUnidadeGestora.js"></script>

<script>
	$(document).ready(function() {
		estruturaPagina();
	});

	function estruturaPagina() {
		$('#formulario')
				.load(
						'recursos/includes/formulario/orcamento/receita/formulario_receita.jsp');
		$('#menu_lateral').load(
				'recursos/includes/menu/menu_lateral_orcamento.jsp');
		$('#modal').load('recursos/includes/estrutura/modal_grande.html');

	}
</script>

</head>
<body>
	<div id="cabecalho">
		<!-- Não apagar, pois é onde encontra-se o menu do site -->
	</div>
	<div class="container text-center">
		<div class="col-lg-12">
			<div class="alert alert-info">ORÇAMENTO</div>
		</div>
	</div>
	<div class="container text-center">
		<div class="col-lg-12">
			<div id="msg_erro"></div>
		</div>
	</div>

	<div class="container text-center">
		<div class="col-lg-12">
			<div class="col-lg-3 col-md-3 col-sm-3">
				<div id="menu_lateral">
					<img alt="carregando" src="recursos/imagens/ajax-loader.gif">
				</div>
			</div>
			<div class="col-lg-9 col-md-9 col-sm-9">
				<div id="formulario">
					<img alt="carregando" src="recursos/imagens/ajax-loader.gif">
				</div>
			</div>
		</div>
	</div>

	<div class="container bg-4 text-center">
		<HR />
		<div id="listar"></div>
	</div>

	<div id="modal"></div>
	<hr />
	<div id="rodape">
		<!-- Não apagar, pois é onde encontra-se o rodape da página -->
	</div>
</body>
</html>