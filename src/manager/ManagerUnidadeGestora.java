package manager;

import java.util.List;

import javax.annotation.ManagedBean;

import entity.UnidadeGestora;
import persistence.DaoUnidadeGestora;

@ManagedBean
public class ManagerUnidadeGestora {

	private UnidadeGestora unidade;
	private List<UnidadeGestora> listaUnidadeGestora;

	public ManagerUnidadeGestora() {
		super();
	}

	public UnidadeGestora getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadeGestora unidade) {
		this.unidade = unidade;
	}

	public List<UnidadeGestora> getListaUnidadeGestora(Integer exercicio) {
		try {
			listaUnidadeGestora = new DaoUnidadeGestora().findAll(exercicio);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaUnidadeGestora;
	}

	public void setListaUnidadeGestora(List<UnidadeGestora> listaUnidadeGestora) {
		this.listaUnidadeGestora = listaUnidadeGestora;
	}

}
