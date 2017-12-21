package dto;


import entity.FonteRecurso;

public class OrcamentoDespesaFonteRecurso {
	private Integer exercicioOrcamento;
	private String valorOrcado;
	private FonteRecurso fonte;
	private transient String valorTotalOrcado;

	public OrcamentoDespesaFonteRecurso() {
		// TODO Auto-generated constructor stub
	}

	public OrcamentoDespesaFonteRecurso(String valorOrcado, FonteRecurso fonte, Integer exercicioOrcamento) {
		super();
		this.exercicioOrcamento = exercicioOrcamento;
		this.valorOrcado = valorOrcado;
		this.fonte = fonte;
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
		return "OrcamentoDespesaFonteRecurso [valorOrcado=" + valorOrcado + ", fonte=" + fonte + "]";
	}

}
