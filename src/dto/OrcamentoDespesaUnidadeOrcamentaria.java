package dto;

import entity.UnidadeExecutora;
import entity.UnidadeOrcamentaria;

public class OrcamentoDespesaUnidadeOrcamentaria {

	private Integer exercicioOrcamento;
	private String valorOrcado;
	private UnidadeExecutora unidadeExecutora;
	private UnidadeOrcamentaria unidadeOrcamentaria;
	private transient String valorTotalOrcado;

	public OrcamentoDespesaUnidadeOrcamentaria() {

	}

	public OrcamentoDespesaUnidadeOrcamentaria(Integer exercicioOrcamento, String valorOrcado,
			UnidadeExecutora unidadeExecutora, UnidadeOrcamentaria unidadeOrcamentaria, String valorTotalOrcado) {
		super();
		this.exercicioOrcamento = exercicioOrcamento;
		this.valorOrcado = valorOrcado;
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

	@Override
	public String toString() {
		return "OrcamentoDespesaUnidadeOrcamentaria [exercicioOrcamento=" + exercicioOrcamento + ", valorOrcado="
				+ valorOrcado + ", unidadeExecutora=" + unidadeExecutora + ", unidadeOrcamentaria="
				+ unidadeOrcamentaria + "]";
	}

}
