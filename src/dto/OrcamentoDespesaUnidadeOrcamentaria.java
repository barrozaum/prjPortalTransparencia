package dto;

import entity.UnidadeExecutora;
import entity.UnidadeGestora;
import entity.UnidadeOrcamentaria;

public class OrcamentoDespesaUnidadeOrcamentaria {

	private Integer exercicioOrcamento;
	private String valorOrcado;
	private UnidadeGestora unidadeGestora;
	private UnidadeExecutora unidadeExecutora;
	private UnidadeOrcamentaria unidadeOrcamentaria;
	private transient String valorTotalOrcado;

	public OrcamentoDespesaUnidadeOrcamentaria() {

	}

	public OrcamentoDespesaUnidadeOrcamentaria(Integer exercicioOrcamento, String valorOrcado,
			UnidadeGestora unidadeGestora, UnidadeExecutora unidadeExecutora, UnidadeOrcamentaria unidadeOrcamentaria,
			String valorTotalOrcado) {
		super();
		this.exercicioOrcamento = exercicioOrcamento;
		this.valorOrcado = valorOrcado;
		this.unidadeGestora = unidadeGestora;
		this.unidadeExecutora = unidadeExecutora;
		this.unidadeOrcamentaria = unidadeOrcamentaria;
		this.valorTotalOrcado = valorTotalOrcado;
	}

	public Integer getExercicioOrcamento() {
		return exercicioOrcamento;
	}

	public void setExercicioOrcamento(Integer exercicioOrcamento) {
		this.exercicioOrcamento = exercicioOrcamento;
	}

	public String getValorOrcado() {
		return valorOrcado;
	}

	public void setValorOrcado(String valorOrcado) {
		this.valorOrcado = valorOrcado;
	}

	public UnidadeExecutora getUnidadeExecutora() {
		return unidadeExecutora;
	}

	public void setUnidadeExecutora(UnidadeExecutora unidadeExecutora) {
		this.unidadeExecutora = unidadeExecutora;
	}

	public UnidadeOrcamentaria getUnidadeOrcamentaria() {
		return unidadeOrcamentaria;
	}

	public void setUnidadeOrcamentaria(UnidadeOrcamentaria unidadeOrcamentaria) {
		this.unidadeOrcamentaria = unidadeOrcamentaria;
	}

	public String getValorTotalOrcado() {
		return valorTotalOrcado;
	}

	public void setValorTotalOrcado(String valorTotalOrcado) {
		this.valorTotalOrcado = valorTotalOrcado;
	}

	public UnidadeGestora getUnidadeGestora() {
		return unidadeGestora;
	}

	public void setUnidadeGestora(UnidadeGestora unidadeGestora) {
		this.unidadeGestora = unidadeGestora;
	}

	@Override
	public String toString() {
		return "OrcamentoDespesaUnidadeOrcamentaria [exercicioOrcamento=" + exercicioOrcamento + ", valorOrcado="
				+ valorOrcado + ", unidadeGestora=" + unidadeGestora + ", unidadeExecutora=" + unidadeExecutora
				+ ", unidadeOrcamentaria=" + unidadeOrcamentaria + ", valorTotalOrcado=" + valorTotalOrcado + "]";
	}

}
