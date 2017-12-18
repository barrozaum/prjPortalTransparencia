package manager;

import java.util.List;

import entity.Empenho;
import persistence.DaoEmpenho;

public class ManagerLrf {

	private List<Empenho> listaPesquisaDetalhada;

	public ManagerLrf() {
		super();
	}

	public List<Empenho> getListaPesquisaDetalhada() {
		return listaPesquisaDetalhada;
	}

	
	public void carregarListaPesquisaDetalhada(Integer exercicio, Integer unidade,String observacao) {
		try {
			DaoEmpenho d = new DaoEmpenho();
			listaPesquisaDetalhada = d.lrfDespesaDetalhada(exercicio, unidade, observacao);
			for (Empenho empenho : listaPesquisaDetalhada) {
				d.valorLiquidoEmpenho(exercicio, empenho);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
