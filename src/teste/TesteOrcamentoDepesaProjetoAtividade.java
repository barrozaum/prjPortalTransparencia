package teste;

import java.util.List;

import dto.OrcamentoDespesaProgramaAtividade;
import persistence.DaoOrcamentoDespesaProgramaAtividade;

public class TesteOrcamentoDepesaProjetoAtividade {

	
	public static void main(String[] args) {
		try {
			
			DaoOrcamentoDespesaProgramaAtividade d = new DaoOrcamentoDespesaProgramaAtividade();
			List<OrcamentoDespesaProgramaAtividade> lista = d.relatorioDespesaProgramaAtividade(2016, 0);
			for (OrcamentoDespesaProgramaAtividade orcamentoDespesaProgramaAtividade : lista) {
				System.out.println(orcamentoDespesaProgramaAtividade);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
