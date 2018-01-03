package dto;

import entity.Atividade;
import entity.Programa;
import entity.UnidadeGestora;

public class OrcamentoDespesaProgramaAtividade {
	private Integer exercicioOrcamento;
	private UnidadeGestora unidadeGestora;
	private Programa programa;
	private Atividade atividade;
	private transient String valorOrcado;

	public OrcamentoDespesaProgramaAtividade() {

	}

	public OrcamentoDespesaProgramaAtividade(Integer exercicioOrcamento, UnidadeGestora unidadeGestora,
			Programa programa, Atividade atividade, String valorOrcado) {
		super();
		this.exercicioOrcamento = exercicioOrcamento;
		this.unidadeGestora = unidadeGestora;
		this.programa = programa;
		this.atividade = atividade;
		this.valorOrcado = valorOrcado;
	}

	public Integer getExercicioOrcamento() {
		return exercicioOrcamento;
	}

	public void setExercicioOrcamento(Integer exercicioOrcamento) {
		this.exercicioOrcamento = exercicioOrcamento;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public String getValorOrcado() {
		return valorOrcado;
	}

	public void setValorOrcado(String valorOrcado) {
		this.valorOrcado = valorOrcado;
	}

	public UnidadeGestora getUnidadeGestora() {
		return unidadeGestora;
	}

	public void setUnidadeGestora(UnidadeGestora unidadeGestora) {
		this.unidadeGestora = unidadeGestora;
	}

	@Override
	public String toString() {
		return "OrcamentoDespesaProgramaAtividade [exercicioOrcamento=" + exercicioOrcamento + ", unidadeGestora="
				+ unidadeGestora + ", programa=" + programa + ", atividade=" + atividade + ", valorOrcado="
				+ valorOrcado + "]";
	}


}
