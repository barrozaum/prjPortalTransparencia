package dto;

import entity.Funcao;
import entity.SubFuncao;
import entity.UnidadeGestora;

public class OrcamentoDespesaFuncaoSubFuncao {

	private Integer exercicioOrcamento;
	private UnidadeGestora unidadeGestora;
	private Funcao funcao;
	private SubFuncao subFuncao;
	private String valor;
	private transient String valorTotalOrcado;

	public OrcamentoDespesaFuncaoSubFuncao() {

	}

	public OrcamentoDespesaFuncaoSubFuncao(Integer exercicioOrcamento, UnidadeGestora unidadeGestora, Funcao funcao,
			SubFuncao subFuncao, String valor, String valorTotalOrcado) {
		super();
		this.exercicioOrcamento = exercicioOrcamento;
		this.unidadeGestora = unidadeGestora;
		this.funcao = funcao;
		this.subFuncao = subFuncao;
		this.valor = valor;
		this.valorTotalOrcado = valorTotalOrcado;
	}

	public Integer getExercicioOrcamento() {
		return exercicioOrcamento;
	}

	public void setExercicioOrcamento(Integer exercicioOrcamento) {
		this.exercicioOrcamento = exercicioOrcamento;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public SubFuncao getSubFuncao() {
		return subFuncao;
	}

	public void setSubFuncao(SubFuncao subFuncao) {
		this.subFuncao = subFuncao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
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
		return "OrcamentoDespesaFuncaoSubFuncao [exercicioOrcamento=" + exercicioOrcamento + ", unidadeGestora="
				+ unidadeGestora + ", funcao=" + funcao + ", subFuncao=" + subFuncao + ", valor=" + valor
				+ ", valorTotalOrcado=" + valorTotalOrcado + "]";
	}

}
