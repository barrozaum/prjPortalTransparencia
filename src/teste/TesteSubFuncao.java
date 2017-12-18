package teste;

import java.util.List;

import entity.SubFuncao;
import persistence.DaoSubFuncao;

public class TesteSubFuncao {

	public static void main(String[] args) {
		try {
			
			DaoSubFuncao d = new DaoSubFuncao();
			List<SubFuncao> listaEmpenhos = d.findSubFuncaoByUnidadeGestoraFuncao(2016, 0, 04);
			for (SubFuncao subfuncao : listaEmpenhos) {
					System.out.println("lista" + subfuncao.toString());
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
