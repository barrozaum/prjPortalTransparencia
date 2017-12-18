package teste;

import java.util.List;

import entity.Empenho;
import persistence.DaoEmpenho;

public class TesteEmpenho {

	public static void main(String[] args) {
		try {
			
			DaoEmpenho d = new DaoEmpenho();
			List<Empenho> listaEmpenhos = d.lrfDespesaDetalhada(2016, 0, "");
				for (Empenho empenho : listaEmpenhos) {
					System.out.println("lista" + empenho.toString());
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
