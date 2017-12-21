package teste;

import java.util.List;

import dto.OrcamentoDespesaGrupoDespesa;
import persistence.DaoOrcamentoDespesaGrupoDespesa;

public class TesteOrcamentoDespesaGrupoDespesa {

	
	public static void main(String[] args) {
		try {
			
			DaoOrcamentoDespesaGrupoDespesa d = new DaoOrcamentoDespesaGrupoDespesa();
			List<OrcamentoDespesaGrupoDespesa>listaOrcamentoDespesaGrupoDespesa = d.relatorioOrcamentoDespesaGrupo(2016, 0);
			for (OrcamentoDespesaGrupoDespesa orcamentoDespesaGrupoDespesa : listaOrcamentoDespesaGrupoDespesa) {
				d.verificarCategoria(2016, orcamentoDespesaGrupoDespesa);
				d.verificarNatureza(2016, orcamentoDespesaGrupoDespesa);
				d.verificarModalidade(2016, orcamentoDespesaGrupoDespesa);
				d.verificarElemento(2016,orcamentoDespesaGrupoDespesa);
				d.verificarSubElemento(2016, orcamentoDespesaGrupoDespesa);
				
				System.out.println(orcamentoDespesaGrupoDespesa);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
