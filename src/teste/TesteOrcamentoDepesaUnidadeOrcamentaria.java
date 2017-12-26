package teste;

import java.util.List;

import dto.OrcamentoDespesaUnidadeOrcamentaria;
import persistence.DaoOrcamentoDespesaUnidadeOrcamentaria;

public class TesteOrcamentoDepesaUnidadeOrcamentaria {

	
	public static void main(String[] args) {
		try {
			
			DaoOrcamentoDespesaUnidadeOrcamentaria d = new DaoOrcamentoDespesaUnidadeOrcamentaria();
			List<OrcamentoDespesaUnidadeOrcamentaria> lista = d.relatorioDespesaUnidadeOrcamentaria(2016, 0);
			for (OrcamentoDespesaUnidadeOrcamentaria orcamentoDespesaUnidadeOrcamentaria : lista) {
				System.out.println(orcamentoDespesaUnidadeOrcamentaria);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
