package control;

import java.text.NumberFormat;
import java.util.Locale;

public class ControleAdicionarMascara {

	public static String addZero(Integer quantidadeZeroEsquerda, Integer quantidadeZeroDireita, String numero) {
		String mascara = numero;

		if (quantidadeZeroDireita != 0) {
			String zeroDireita = "";
			for (int i = 0; i < quantidadeZeroDireita; i++) {
				zeroDireita += "0";
			}
			mascara = mascara + zeroDireita;
		}

		if (quantidadeZeroEsquerda != 0) {
			String zeroEsquerda = "";
			for (int i = 0; i < quantidadeZeroEsquerda; i++) {
				zeroEsquerda += "0";
			}
			mascara = zeroEsquerda + mascara;
		}

		return mascara;
	}

	public static String addPontos(String mascara, String numero) {
		String formatado = "";
		if (mascara.equals("grupo_despesa")) {
			formatado = numero.substring(0, 1) + "." + numero.substring(1, 2) + "." + numero.substring(2, 4) + "."
					+ numero.substring(4, 6) + "." + numero.substring(6, 8);
		}

		return formatado;
	}

	public static String dataBrasileira(String data) {
		String dataFormatada = "";
		String ano = data.substring(0, 4);
		String mes = data.substring(1, 3);
		String dia = data.substring(8, 10);
		dataFormatada = dia + "/" + mes + "/" + ano;
		return dataFormatada;

	}

	public static String formataDataReal(String valor) {
		String valorFormatado = "";
		
		Locale meuLocal = new Locale( "pt", "BR" ); 
        NumberFormat nfVal = NumberFormat.getCurrencyInstance( meuLocal ); 
        double teste = new Double(valor);
        valorFormatado = nfVal.format(teste);
        
        
		return valorFormatado;
	}
	
	public static String retirarPontos(String valor) {
		String novoValor = "";
		novoValor = valor.replace(".", "");
		return novoValor;
				
	}

}
