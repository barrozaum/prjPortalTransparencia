package manager;

import java.util.ArrayList;
import java.util.List;

import control.ControleAdicionarMascara;
import dto.OrcamentoDespesaFonteRecurso;
import dto.OrcamentoDespesaFuncaoSubFuncao;
import dto.OrcamentoDespesaGrupoDespesa;
import dto.OrcamentoDespesaProgramaAtividade;
import dto.OrcamentoDespesaUnidadeOrcamentaria;
import dto.OrcamentoReceita;
import entity.Nivel;
import persistence.DaoOrcamentoDespesaFonteRecurso;
import persistence.DaoOrcamentoDespesaFuncaoSubFuncao;
import persistence.DaoOrcamentoDespesaGrupoDespesa;
import persistence.DaoOrcamentoDespesaProgramaAtividade;
import persistence.DaoOrcamentoDespesaUnidadeOrcamentaria;
import persistence.DaoOrcamentoReceitaPrevista;

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

	private OrcamentoReceita orcamentoReceita;
	private List<OrcamentoReceita> listaOrcamentoReceita;

	public ManagerOrcamento() {
		listaOrcamentoDespesaFuncaoSubFuncao = new ArrayList<OrcamentoDespesaFuncaoSubFuncao>();
		listaOrcamentoDespesaFonteRecurso = new ArrayList<OrcamentoDespesaFonteRecurso>();
		listaOrcamentoDespesaGrupoDespesa = new ArrayList<OrcamentoDespesaGrupoDespesa>();
		listaOrcamentoDespesaProgramaAtividade = new ArrayList<OrcamentoDespesaProgramaAtividade>();
		listaOrcamentoDespesaUnidadeOrcamentaria = new ArrayList<OrcamentoDespesaUnidadeOrcamentaria>();
		listaOrcamentoReceita = new ArrayList<OrcamentoReceita>();
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

	public OrcamentoReceita getOrcamentoReceita() {
		return orcamentoReceita;
	}

	public void setOrcamentoReceita(OrcamentoReceita orcamentoReceita) {
		this.orcamentoReceita = orcamentoReceita;
	}

	public List<OrcamentoReceita> getListaOrcamentoReceita() {
		return listaOrcamentoReceita;
	}

	public void setListaOrcamentoReceita(List<OrcamentoReceita> listaOrcamentoReceita) {
		this.listaOrcamentoReceita = listaOrcamentoReceita;
	}

	public List<OrcamentoDespesaFuncaoSubFuncao> pesquisaOrcamentoDespesaFuncaoSubFuncao(Integer exercicio,
			Integer unidadeGestora, Integer codigoFuncao, Integer codigoSubFuncao) {
		try {
			listaOrcamentoDespesaFuncaoSubFuncao = new DaoOrcamentoDespesaFuncaoSubFuncao()
					.relatorioOrcamentoFuncaoSubFuncao(exercicio, unidadeGestora, codigoFuncao, codigoSubFuncao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!listaOrcamentoDespesaFuncaoSubFuncao.isEmpty())
			orcamentoDespesaFuncaoSubFuncao = listaOrcamentoDespesaFuncaoSubFuncao.get(listaOrcamentoDespesaFuncaoSubFuncao.size()-1);
			
		return listaOrcamentoDespesaFuncaoSubFuncao;
	}

	public List<OrcamentoDespesaFonteRecurso> pesquisaOrcamentoDespesaFonteRecurso(Integer exercicio,
			Integer unidadeGestora) {
		try {
			listaOrcamentoDespesaFonteRecurso = new DaoOrcamentoDespesaFonteRecurso()
					.relatorioDespesaFonteRecurso(exercicio, unidadeGestora);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!listaOrcamentoDespesaFonteRecurso.isEmpty())
			orcamentoFonteRecurso = listaOrcamentoDespesaFonteRecurso.get(listaOrcamentoDespesaFonteRecurso.size()-1);
			
		return listaOrcamentoDespesaFonteRecurso;
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

	public String valorPorNivelDespesa(Integer nivel, OrcamentoDespesaGrupoDespesa orcamento) {
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
		if(!listaOrcamentoDespesaProgramaAtividade.isEmpty())
			orcamentoDespesaProgramaAtividade = listaOrcamentoDespesaProgramaAtividade.get(listaOrcamentoDespesaProgramaAtividade.size()-1);
			
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
		if(!listaOrcamentoDespesaUnidadeOrcamentaria.isEmpty())
		orcamentoDespesaUnidadeOrcamentaria = listaOrcamentoDespesaUnidadeOrcamentaria.get(listaOrcamentoDespesaUnidadeOrcamentaria.size()-1);
		return listaOrcamentoDespesaUnidadeOrcamentaria;
	}

	public List<OrcamentoReceita> pesquisaOrcamentoReceita(Integer exercicio, Integer unidadeGestora) {
		try {
			DaoOrcamentoReceitaPrevista d = new DaoOrcamentoReceitaPrevista();
			listaOrcamentoReceita = d.relatorioOrcamentoReceitaPrevista(exercicio, unidadeGestora);

			for (OrcamentoReceita orcamentoReceitaLocal : listaOrcamentoReceita) {
				d.verificarDescricaoNivel(exercicio, orcamentoReceitaLocal);
				Integer posicao = 0;
				for (Nivel nivel : orcamentoReceitaLocal.getListaNivel()) {
					d.verificarValorOrcadoReceita(exercicio, unidadeGestora, nivel, posicao);
					posicao++;
				}
				orcamentoReceita = orcamentoReceitaLocal;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaOrcamentoReceita;
	}

	public String DeducaoFiscal(String conta, String valor, String total) {
		Double retorno = 0.0;
		if (conta.equalsIgnoreCase("9000.00.00.00")) {
			retorno = (ControleAdicionarMascara.formataDinheiroCalculo(total)
					- ControleAdicionarMascara.formataDinheiroCalculo(valor));
		} else {
			retorno = (ControleAdicionarMascara.formataDinheiroCalculo(valor)
					+ ControleAdicionarMascara.formataDinheiroCalculo(total));
		}
		return ControleAdicionarMascara.formataDataReal(retorno.toString());
	}

}
