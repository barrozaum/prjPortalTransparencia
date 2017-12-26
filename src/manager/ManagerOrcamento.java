package manager;

import java.util.ArrayList;
import java.util.List;

import dto.OrcamentoDespesaFonteRecurso;
import dto.OrcamentoDespesaFuncaoSubFuncao;
import dto.OrcamentoDespesaGrupoDespesa;
import dto.OrcamentoDespesaProgramaAtividade;
import dto.OrcamentoDespesaUnidadeOrcamentaria;
import entity.Empenho;
import persistence.Dao;
import persistence.DaoEmpenho;
import persistence.DaoOrcamentoDespesaFonteRecurso;
import persistence.DaoOrcamentoDespesaFuncaoSubFuncao;
import persistence.DaoOrcamentoDespesaGrupoDespesa;
import persistence.DaoOrcamentoDespesaProgramaAtividade;
import persistence.DaoOrcamentoDespesaUnidadeOrcamentaria;

public class ManagerOrcamento {

	private OrcamentoDespesaFuncaoSubFuncao orcamentoDespesaFuncaoSubFuncao;
	private List<OrcamentoDespesaFuncaoSubFuncao> listaOrcamentoDespesaFuncaoSubFuncao;

	private OrcamentoDespesaFonteRecurso orcamentoFonteRecurso;
	private List<OrcamentoDespesaFonteRecurso> listaOrcamentoDespesaFonteRecurso;

	private OrcamentoDespesaGrupoDespesa orcamentoDespesaGrupoDespesa;
	private List<OrcamentoDespesaGrupoDespesa> listaOrcamentoDespesaGrupoDespesa;

	private OrcamentoDespesaProgramaAtividade orcamentoDespesaProgramaAtividade;
	private List<OrcamentoDespesaProgramaAtividade> listaOrcamentoDespesaProgramaAtividade;

	private OrcamentoDespesaUnidadeOrcamentaria orcamentoDespesaUnidadeOrcamentaria;
	private List<OrcamentoDespesaUnidadeOrcamentaria> listaOrcamentoDespesaUnidadeOrcamentaria;

	public ManagerOrcamento() {
		listaOrcamentoDespesaFuncaoSubFuncao = new ArrayList<OrcamentoDespesaFuncaoSubFuncao>();
		listaOrcamentoDespesaFonteRecurso = new ArrayList<OrcamentoDespesaFonteRecurso>();
		listaOrcamentoDespesaGrupoDespesa = new ArrayList<OrcamentoDespesaGrupoDespesa>();
		listaOrcamentoDespesaProgramaAtividade = new ArrayList<OrcamentoDespesaProgramaAtividade>();
		listaOrcamentoDespesaUnidadeOrcamentaria = new ArrayList<OrcamentoDespesaUnidadeOrcamentaria>();
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

	public List<OrcamentoDespesaFonteRecurso> getListaOrcamentoDespesaFonteRecurso() {
		return listaOrcamentoDespesaFonteRecurso;
	}

	public void setListaOrcamentoDespesaFonteRecurso(
			List<OrcamentoDespesaFonteRecurso> listaOrcamentoDespesaFonteRecurso) {
		this.listaOrcamentoDespesaFonteRecurso = listaOrcamentoDespesaFonteRecurso;
	}

	public OrcamentoDespesaGrupoDespesa getOrcamentoDespesaGrupoDespesa() {
		return orcamentoDespesaGrupoDespesa;
	}

	public void setOrcamentoDespesaGrupoDespesa(OrcamentoDespesaGrupoDespesa orcamentoDespesaGrupoDespesa) {
		this.orcamentoDespesaGrupoDespesa = orcamentoDespesaGrupoDespesa;
	}

	public List<OrcamentoDespesaGrupoDespesa> getListaOrcamentoDespesaGrupoDespesa() {
		return listaOrcamentoDespesaGrupoDespesa;
	}

	public void setListaOrcamentoDespesaGrupoDespesa(
			List<OrcamentoDespesaGrupoDespesa> listaOrcamentoDespesaGrupoDespesa) {
		this.listaOrcamentoDespesaGrupoDespesa = listaOrcamentoDespesaGrupoDespesa;
	}

	public OrcamentoDespesaProgramaAtividade getOrcamentoDespesaProgramaAtividade() {
		return orcamentoDespesaProgramaAtividade;
	}

	public void setOrcamentoDespesaProgramaAtividade(
			OrcamentoDespesaProgramaAtividade orcamentoDespesaProgramaAtividade) {
		this.orcamentoDespesaProgramaAtividade = orcamentoDespesaProgramaAtividade;
	}

	public List<OrcamentoDespesaProgramaAtividade> getListaOrcamentoDespesaProgramaAtividade() {
		return listaOrcamentoDespesaProgramaAtividade;
	}

	public void setListaOrcamentoDespesaProgramaAtividade(
			List<OrcamentoDespesaProgramaAtividade> listaOrcamentoDespesaProgramaAtividade) {
		this.listaOrcamentoDespesaProgramaAtividade = listaOrcamentoDespesaProgramaAtividade;
	}

	public OrcamentoDespesaUnidadeOrcamentaria getOrcamentoDespesaUnidadeOrcamentaria() {
		return orcamentoDespesaUnidadeOrcamentaria;
	}

	public void setOrcamentoDespesaUnidadeOrcamentaria(
			OrcamentoDespesaUnidadeOrcamentaria orcamentoDespesaUnidadeOrcamentaria) {
		this.orcamentoDespesaUnidadeOrcamentaria = orcamentoDespesaUnidadeOrcamentaria;
	}

	public List<OrcamentoDespesaUnidadeOrcamentaria> getListaOrcamentoDespesaUnidadeOrcamentaria() {
		return listaOrcamentoDespesaUnidadeOrcamentaria;
	}

	public void setListaOrcamentoDespesaUnidadeOrcamentaria(
			List<OrcamentoDespesaUnidadeOrcamentaria> listaOrcamentoDespesaUnidadeOrcamentaria) {
		this.listaOrcamentoDespesaUnidadeOrcamentaria = listaOrcamentoDespesaUnidadeOrcamentaria;
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
			listaOrcamentoDespesaFonteRecurso = new DaoOrcamentoDespesaFonteRecurso()
					.relatorioDespesaFonteRecurso(exercicio, unidadeGestora);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaOrcamentoDespesaFuncaoSubFuncao;
	}

	public List<OrcamentoDespesaGrupoDespesa> pesquisaOrcamentoDespesaGrupoDespesa(Integer exercicio,
			Integer unidadeGestora) {
		try {
			DaoOrcamentoDespesaGrupoDespesa d = new DaoOrcamentoDespesaGrupoDespesa();
			listaOrcamentoDespesaGrupoDespesa = d.relatorioOrcamentoDespesaGrupo(exercicio, unidadeGestora);
			for (OrcamentoDespesaGrupoDespesa orcamentoDespesaGrupoDespesaLocal : listaOrcamentoDespesaGrupoDespesa) {
				d.verificarCategoria(exercicio, orcamentoDespesaGrupoDespesaLocal);
				d.verificarNatureza(exercicio, orcamentoDespesaGrupoDespesaLocal);
				d.verificarModalidade(exercicio, orcamentoDespesaGrupoDespesaLocal);
				d.verificarElemento(exercicio, orcamentoDespesaGrupoDespesaLocal);
				d.verificarSubElemento(exercicio, orcamentoDespesaGrupoDespesaLocal);
				orcamentoDespesaGrupoDespesa = orcamentoDespesaGrupoDespesaLocal;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaOrcamentoDespesaGrupoDespesa;
	}

	public String valorPorNivel(Integer nivel, OrcamentoDespesaGrupoDespesa orcamento) {
		try {
			DaoOrcamentoDespesaGrupoDespesa d = new DaoOrcamentoDespesaGrupoDespesa();
			d.verificarValorOrcadoGrupo(nivel, orcamento);
			return orcamento.getValorOrcadoGrupo();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public List<OrcamentoDespesaProgramaAtividade> pesquisaOrcamentoDespesaProgramaAtividade(Integer exercicio,
			Integer unidadeGestora) {
		try {
			listaOrcamentoDespesaProgramaAtividade = new DaoOrcamentoDespesaProgramaAtividade()
					.relatorioDespesaProgramaAtividade(exercicio, unidadeGestora);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaOrcamentoDespesaProgramaAtividade;
	}

	public List<OrcamentoDespesaUnidadeOrcamentaria> pesquisaOrcamentoDespesaUnidadeOrcamentaria(Integer exercicio,
			Integer unidadeGestora) {
		try {
			listaOrcamentoDespesaUnidadeOrcamentaria = new DaoOrcamentoDespesaUnidadeOrcamentaria()
					.relatorioDespesaUnidadeOrcamentaria(exercicio, unidadeGestora);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaOrcamentoDespesaUnidadeOrcamentaria;
	}
}
