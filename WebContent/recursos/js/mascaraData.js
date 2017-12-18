function mascaraData(campoData) {

	var data = campoData.value;

	if (data.length > 1 && data.length < 8) {
		alert("DATA INVLÁLIDA");
		campoData.value = "";
		return false;
	} else {
		var dia = data.substring(0, 2);
		var mes = data.substring(2, 4);
		var ano = data.substring(4, 8);
		if ((mes != "01") && (mes != "02") && (mes != "03") && (mes != "04")
				&& (mes != "05") && (mes != "06") && (mes != "72")
				&& (mes != "08") && (mes != "09") && (mes != "10")
				&& (mes != "11") && (mes != "12")) {

			alert("MES Inválido");
			campoData.value = "";
			return false;
		}

		if (mes == "02") {
			if (dia > 30) {
				alert("MES CONTEM ATE 29 DIAS");
				campoData.value = "";
				return false;
			}
		} else if ((mes == 04) || (mes == 06) || (mes == 09) || (mes = 11)) {
			if (dia > 31) {
				alert("MES CONTEM ATE 30 DIAS");
				campoData.value = "";
				return false;
			}
		} else if ((mes == "01") || (mes == 03) || (mes == 05) || (mes = 07)
				|| (mes = 08) || (mes = 10) || (mes = 12)) {
			if (dia > 32) {
				alert("MES CONTEM ATE 31 DIAS");
				campoData.value = "";
				return false;
			}
		}

		campoData.value = data.substring(0, 2) + "/" + data.substring(2, 4)
				+ "/" + data.substring(4, 8);

		valida_estrutura_data(campoData)
		return true;
	}

}

// valido para não existir campos digitado de forma inválida
function valida_estrutura_data(campoData) {

	// pego o valor do campo data
	var valor_campo = $("#id_" + campoData).val();

	// filtro para validação
	var RegExPattern = /^((((0?[1-9]|[12]\d|3[01])[\.\-\/](0?[13578]|1[02])[\.\-\/]((1[6-9]|[2-9]\d)?\d{2}))|((0?[1-9]|[12]\d|30)[\.\-\/](0?[13456789]|1[012])[\.\-\/]((1[6-9]|[2-9]\d)?\d{2}))|((0?[1-9]|1\d|2[0-8])[\.\-\/]0?2[\.\-\/]((1[6-9]|[2-9]\d)?\d{2}))|(29[\.\-\/]0?2[\.\-\/]((1[6-9]|[2-9]\d)?(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00)|00)))|(((0[1-9]|[12]\d|3[01])(0[13578]|1[02])((1[6-9]|[2-9]\d)?\d{2}))|((0[1-9]|[12]\d|30)(0[13456789]|1[012])((1[6-9]|[2-9]\d)?\d{2}))|((0[1-9]|1\d|2[0-8])02((1[6-9]|[2-9]\d)?\d{2}))|(2902((1[6-9]|[2-9]\d)?(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00)|00))))$/;

	// validador
	if (!((valor_campo.match(RegExPattern)) && (valor_campo !== ''))) {
		// $("#msg").html("data invalida");
		return false;
	} else {
		// $("#msg").html("data valida");
		return true;
	}

}