package teste;

import java.util.List;

import dto.OrcamentoDespesaFuncaoSubFuncao;
import persistence.DaoOrcamentoDespesaFuncaoSubFuncao;

public class TesteOrcamentoDespesaFuncaoSubFuncao {

	public static void main(String[] args) {
		try {

			DaoOrcamentoDespesaFuncaoSubFuncao d = new DaoOrcamentoDespesaFuncaoSubFuncao();
			List<OrcamentoDespesaFuncaoSubFuncao> lista = d.relatorioOrcamentoFuncaoSubFuncao(2016, 9999, 0, 0);
			for (OrcamentoDespesaFuncaoSubFuncao odfs : lista) {
				System.out.println("lista" + odfs.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
