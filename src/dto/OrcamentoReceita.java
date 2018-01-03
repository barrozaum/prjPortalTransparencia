package dto;

import java.util.List;

import entity.Nivel;
import entity.UnidadeGestora;

public class OrcamentoReceita {

	private Integer exercicioOrcamento;
	private UnidadeGestora unidadeGestora;
	private List<Nivel> listaNivel;
	private transient String valorTotalOrcado;

	public OrcamentoReceita() {

	}

	public OrcamentoReceita(Integer exercicioOrcamento, UnidadeGestora unidadeGestora, List<Nivel> listaNivel,
			String valorTotalOrcado) {
		super();
		this.exercicioOrcamento = exercicioOrcamento;
		this.unidadeGestora = unidadeGestora;
		this.listaNivel = listaNivel;
		this.valorTotalOrcado = valorTotalOrcado;
	}

	public Integer getExercicioOrcamento() {
		return exercicioOrcamento;
	}

	public void setExercicioOrcamento(Integer exercicioOrcamento) {
		this.exercicioOrcamento = exercicioOrcamento;
	}

	public UnidadeGestora getUnidadeGestora() {
		return unidadeGestora;
	}

	public void setUnidadeGestora(UnidadeGestora unidadeGestora) {
		this.unidadeGestora = unidadeGestora;
	}

	public List<Nivel> getListaNivel() {
		return listaNivel;
	}

	public void setListaNivel(List<Nivel> listaNivel) {
		this.listaNivel = listaNivel;
	}

	public String getValorTotalOrcado() {
		return valorTotalOrcado;
	}

	public void setValorTotalOrcado(String valorTotalOrcado) {
		this.valorTotalOrcado = valorTotalOrcado;
	}

	@Override
	public String toString() {
		return "OrcamentoReceita [exercicioOrcamento=" + exercicioOrcamento + ", unidadeGestora=" + unidadeGestora
				+ ", listaNivel=" + listaNivel + ", valorTotalOrcado=" + valorTotalOrcado + "]";
	}

}
