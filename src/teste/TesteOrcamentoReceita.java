package teste;

import java.util.List;

import dto.OrcamentoReceita;
import entity.Nivel;
import persistence.DaoOrcamentoReceitaPrevista;

public class TesteOrcamentoReceita {

	public static void main(String[] args) {
		try {
			DaoOrcamentoReceitaPrevista d = new DaoOrcamentoReceitaPrevista();
			List<OrcamentoReceita> lista = d.relatorioOrcamentoReceitaPrevista(2016, 0);
			for (OrcamentoReceita orcamentoReceita : lista) {
//				System.out.println(orcamentoReceita);
//				for (Nivel nivel : orcamentoReceita.getListaNivel()) {
//					System.out.println(nivel);
//				}
				System.out.println(orcamentoReceita.getListaNivel().get(6));
				
			}
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
