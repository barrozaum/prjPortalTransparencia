<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Portal Trânsparencia</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="recursos/css/bootstrap.css" rel="stylesheet">
<link href="recursos/css/menu.css" rel="stylesheet">
<script src="recursos/js/jquery.min.js"></script>
<script src="recursos/js/bootstrap.min.js"></script>
<link rel="apple-touch-icon" href="/bootstrap/img/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="/bootstrap/img/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="/bootstrap/img/apple-touch-icon-114x114.png">
<script src="recursos/js/estrutura.js"></script>

<!-- Includes para Colocar o Calendário na data -->
<link rel="stylesheet"
	href="recursos/css/redmond/jquery-ui-1.10.1.custom.css" />
<script src="recursos/js/data_calendario.js" type="text/javascript"></script>
<script src="recursos/js/calendario.js" type="text/javascript"></script>
<script src="recursos/js/mascaraData.js"></script>
<script src="recursos/js/despesa.js"></script>
<!-- fim dos includes para Colocar a Data -->

<link rel="stylesheet" href="recursos/css/jquery.dataTables.min.css">
<script src="recursos/js/jquery.dataTables.min.js"></script>
<script>
	$(document).ready(function() {
		estruturaPagina();
	});

	function estruturaPagina() {
		$('#formulario')
				.load(
						'recursos/includes/formulario/despesa/formulario_despesa_sub_funcao.jsp');
		$('#menu_lateral').load(
				'recursos/includes/menu/menu_lateral_despesa.jsp');
		$('#modal').load('recursos/includes/estrutura/modal_grande.html');

	}
</script>

</head>
<body>
	<div id="cabecalho">
		<!-- Não apagar, pois é onde encontra-se o menu do site -->
	</div>

	<div class="container text center">

		<div class="panel-group" id="accordion">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapse1"> LOA</a>
					</h4>
				</div>
				<div id="collapse1" class="panel-collapse collapse ">
					<div class="panel-body">
						<ul class="list-group">
							<li class="list-group-item">One</li>
							<li class="list-group-item">Two</li>
							<li class="list-group-item">Three</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapse2"> PPA</a>
					</h4>
				</div>
				<div id="collapse2" class="panel-collapse collapse">
					<div class="panel-body">
						<ul class="list-group">
							<li class="list-group-item">One</li>
							<li class="list-group-item">Two</li>
							<li class="list-group-item">Three</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapse3"> LDO</a>
					</h4>
				</div>
				<div id="collapse3" class="panel-collapse collapse">
					<div class="panel-body">
						<ul class="list-group">
							<li class="list-group-item">One</li>
							<li class="list-group-item">Two</li>
							<li class="list-group-item">Three</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="rodape">
		<!-- Não apagar, pois é onde encontra-se o rodape da página -->
	</div>
</body>
</html>