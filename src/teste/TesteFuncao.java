package teste;

import java.util.List;

import entity.Empenho;
import entity.Funcao;
import persistence.DaoEmpenho;
import persistence.DaoFuncao;

public class TesteFuncao {

	public static void main(String[] args) {
		try {
			
			DaoFuncao d = new DaoFuncao();
			List<Funcao> listaEmpenhos = d.findFuncaoByUnidadeGestora(2016, 0);
			for (Funcao funcao : listaEmpenhos) {
					System.out.println("lista" + funcao.toString());
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
