package manager;

import java.util.ArrayList;
import java.util.List;

import entity.Funcao;
import entity.Orgao;
import entity.SubFuncao;
import persistence.DaoFuncao;
import persistence.DaoOrgao;
import persistence.DaoSubFuncao;

public class ManagerFuncaoSubFuncao {

	private Funcao funcao;
	private SubFuncao subFuncao;
	private List<Funcao> listaFuncoes;
	private List<SubFuncao> listaSubFuncao;

	public ManagerFuncaoSubFuncao() {
		listaFuncoes = new ArrayList<Funcao>();
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public List<Funcao> getListaFuncoes() {
		return listaFuncoes;
	}

	public void setListaFuncoes(List<Funcao> listaFuncoes) {
		this.listaFuncoes = listaFuncoes;
	}

	public SubFuncao getSubFuncao() {
		return subFuncao;
	}

	public void setSubFuncao(SubFuncao subFuncao) {
		this.subFuncao = subFuncao;
	}

	public List<SubFuncao> getListaSubFuncao() {
		return listaSubFuncao;
	}

	public void setListaSubFuncao(List<SubFuncao> listaSubFuncao) {
		this.listaSubFuncao = listaSubFuncao;
	}

	public List<Funcao> findFuncaoByUnidadeGestora(Integer exercicio, Integer codigoUnidadeGestora) {

		try {
			listaFuncoes = new DaoFuncao().findFuncaoByUnidadeGestora(exercicio, codigoUnidadeGestora);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaFuncoes;

	}

	public List<SubFuncao> findSubFuncaoByUnidadeGestoraFuncao(Integer exercicio, Integer codigoUnidadeGestora,
			Integer codigoFuncao) {

		try {
			listaSubFuncao = new DaoSubFuncao().findSubFuncaoByUnidadeGestoraFuncao(exercicio, codigoUnidadeGestora,
					codigoFuncao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaSubFuncao;
	}

}
