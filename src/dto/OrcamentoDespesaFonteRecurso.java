package dto;

import entity.FonteRecurso;
import entity.UnidadeGestora;

public class OrcamentoDespesaFonteRecurso {
	private Integer exercicioOrcamento;
	private UnidadeGestora unidadeGestora;
	private String valorOrcado;
	private FonteRecurso fonte;
	private transient String valorTotalOrcado;

	public OrcamentoDespesaFonteRecurso() {
		// TODO Auto-generated constructor stub
	}

	public OrcamentoDespesaFonteRecurso(Integer exercicioOrcamento, UnidadeGestora unidadeGestora, String valorOrcado,
			FonteRecurso fonte, String valorTotalOrcado) {
		super();
		this.exercicioOrcamento = exercicioOrcamento;
		this.unidadeGestora = unidadeGestora;
		this.valorOrcado = valorOrcado;
		this.fonte = fonte;
		this.valorTotalOrcado = valorTotalOrcado;
	}

	public UnidadeGestora getUnidadeGestora() {
		return unidadeGestora;
	}

	public void setUnidadeGestora(UnidadeGestora unidadeGestora) {
		this.unidadeGestora = unidadeGestora;
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

	public FonteRecurso getFonte() {
		return fonte;
	}

	public void setFonte(FonteRecurso fonte) {
		this.fonte = fonte;
	}

	public String getValorTotalOrcado() {
		return this.valorTotalOrcado;
	}

	public void setValorTotalOrcado(String valorTotalOrcado) {
		// somo o valor passado com o valor que ja tem

		this.valorTotalOrcado = valorTotalOrcado;
	}

	@Override
	public String toString() {
		return "OrcamentoDespesaFonteRecurso [exercicioOrcamento=" + exercicioOrcamento + ", unidadeGestora="
				+ unidadeGestora + ", valorOrcado=" + valorOrcado + ", fonte=" + fonte + ", valorTotalOrcado="
				+ valorTotalOrcado + "]";
	}

}
