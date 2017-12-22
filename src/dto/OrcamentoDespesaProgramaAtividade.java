package dto;

import entity.Atividade;
import entity.Programa;

public class OrcamentoDespesaProgramaAtividade {
	private Integer exercicioOrcamento;
	private Programa programa;
	private Atividade atividade;
	private String valorOrcado;

	public OrcamentoDespesaProgramaAtividade() {

	}

	public OrcamentoDespesaProgramaAtividade(Integer exercicioOrcamento, Programa programa, Atividade atividade,
			String valorOrcado) {
		super();
		this.exercicioOrcamento = exercicioOrcamento;
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

	@Override
	public String toString() {
		return "OrcamentoDespesaProgramaAtividade [exercicioOrcamento=" + exercicioOrcamento + ", programa=" + programa
				+ ", atividade=" + atividade + ", valorOrcado=" + valorOrcado + "]";
	}

}
