package manager;

import java.util.ArrayList;
import java.util.List;

import entity.OrcamentoDespesaFonteRecurso;
import entity.OrcamentoDespesaFuncaoSubFuncao;
import persistence.DaoOrcamentoDespesaFonteRecurso;
import persistence.DaoOrcamentoDespesaFuncaoSubFuncao;

public class ManagerOrcamento {

	private OrcamentoDespesaFuncaoSubFuncao orcamentoDespesaFuncaoSubFuncao;
	private List<OrcamentoDespesaFuncaoSubFuncao> listaOrcamentoDespesaFuncaoSubFuncao;
	private OrcamentoDespesaFonteRecurso orcamentoFonteRecurso;
	private List<OrcamentoDespesaFonteRecurso> listaOrcamentoFonteRecurso;

	public ManagerOrcamento() {
		listaOrcamentoDespesaFuncaoSubFuncao = new ArrayList<OrcamentoDespesaFuncaoSubFuncao>();
		listaOrcamentoFonteRecurso = new ArrayList<OrcamentoDespesaFonteRecurso>();
	}

	public OrcamentoDespesaFuncaoSubFuncao getOrcamentoDespesaFuncaoSubFuncao() {
		return orcamentoDespesaFuncaoSubFuncao;
	}

	public void setOrcamentoDespesaFuncaoSubFuncao(OrcamentoDespesaFuncaoSubFuncao orcamentoDespesaFuncaoSubFuncao) {
		this.orcamentoDespesaFuncaoSubFuncao = orcamentoDespesaFuncaoSubFuncao;
	}

	public List<OrcamentoDespesaFuncaoSubFuncao> getListaOrcamentoDespesaFuncaoSubFuncao() {
		return listaOrcamentoDespesaFuncaoSubFuncao;
	}

	public void setListaOrcamentoDespesaFuncaoSubFuncao(
			List<OrcamentoDespesaFuncaoSubFuncao> listaOrcamentoDespesaFuncaoSubFuncao) {
		this.listaOrcamentoDespesaFuncaoSubFuncao = listaOrcamentoDespesaFuncaoSubFuncao;
	}

	public OrcamentoDespesaFonteRecurso getOrcamentoFonteRecurso() {
		return orcamentoFonteRecurso;
	}

	public void setOrcamentoFonteRecurso(OrcamentoDespesaFonteRecurso orcamentoFonteRecurso) {
		this.orcamentoFonteRecurso = orcamentoFonteRecurso;
	}

	public List<OrcamentoDespesaFonteRecurso> getListaOrcamentoFonteRecurso() {
		return listaOrcamentoFonteRecurso;
	}

	public void setListaOrcamentoFonteRecurso(List<OrcamentoDespesaFonteRecurso> listaOrcamentoFonteRecurso) {
		this.listaOrcamentoFonteRecurso = listaOrcamentoFonteRecurso;
	}

	public List<OrcamentoDespesaFuncaoSubFuncao> pesquisaOrcamentoDespesaFuncaoSubFuncao(Integer exercicio,
			Integer unidadeGestora, Integer codigoFuncao, Integer codigoSubFuncao) {
		try {
			listaOrcamentoDespesaFuncaoSubFuncao = new DaoOrcamentoDespesaFuncaoSubFuncao()
					.relatorioOrcamentoFuncaoSubFuncao(exercicio, unidadeGestora, codigoFuncao, codigoSubFuncao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaOrcamentoDespesaFuncaoSubFuncao;
	}

	public List<OrcamentoDespesaFuncaoSubFuncao> pesquisaOrcamentoDespesaFonteRecurso(Integer exercicio,
			Integer unidadeGestora) {
		try {
			listaOrcamentoFonteRecurso = new DaoOrcamentoDespesaFonteRecurso().findAll(exercicio, unidadeGestora);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaOrcamentoDespesaFuncaoSubFuncao;
	}
}
