package dto;

import entity.Categoria;
import entity.Elemento;
import entity.Modalidade;
import entity.Natureza;
import entity.SubElemento;
import entity.UnidadeGestora;

public class OrcamentoDespesaGrupoDespesa {

	private Integer exercicioOrcamento;
	private UnidadeGestora unidadeGestora;
	private String codigo;
	private Categoria categoria;
	private Natureza natureza;
	private Modalidade modalidade;
	private Elemento elemento;
	private SubElemento subElemento;
	private String valorOrcado;
	private transient String valorOrcadoGrupo;
	private transient String valorTotalOrcado;

	public OrcamentoDespesaGrupoDespesa() {

	}

	public OrcamentoDespesaGrupoDespesa(Integer exercicioOrcamento, UnidadeGestora unidadeGestora, String codigo,
			Categoria categoria, Natureza natureza, Modalidade modalidade, Elemento elemento, SubElemento subElemento,
			String valorOrcado, String valorOrcadoGrupo, String valorTotalOrcado) {
		super();
		this.exercicioOrcamento = exercicioOrcamento;
		this.unidadeGestora = unidadeGestora;
		this.codigo = codigo;
		this.categoria = categoria;
		this.natureza = natureza;
		this.modalidade = modalidade;
		this.elemento = elemento;
		this.subElemento = subElemento;
		this.valorOrcado = valorOrcado;
		this.valorOrcadoGrupo = valorOrcadoGrupo;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Natureza getNatureza() {
		return natureza;
	}

	public void setNatureza(Natureza natureza) {
		this.natureza = natureza;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public SubElemento getSubElemento() {
		return subElemento;
	}

	public void setSubElemento(SubElemento subElemento) {
		this.subElemento = subElemento;
	}

	public String getValorOrcado() {
		return valorOrcado;
	}

	public void setValorOrcado(String valorOrcado) {
		this.valorOrcado = valorOrcado;
	}

	public String getValorOrcadoGrupo() {
		return valorOrcadoGrupo;
	}

	public void setValorOrcadoGrupo(String valorOrcadoGrupo) {
		this.valorOrcadoGrupo = valorOrcadoGrupo;
	}

	public String getValorTotalOrcado() {
		return valorTotalOrcado;
	}

	public void setValorTotalOrcado(String valorTotalOrcado) {
		this.valorTotalOrcado = valorTotalOrcado;
	}

	@Override
	public String toString() {
		return "OrcamentoDespesaGrupoDespesa [exercicioOrcamento=" + exercicioOrcamento + ", unidadeGestora="
				+ unidadeGestora + ", codigo=" + codigo + ", categoria=" + categoria + ", natureza=" + natureza
				+ ", modalidade=" + modalidade + ", elemento=" + elemento + ", subElemento=" + subElemento
				+ ", valorOrcado=" + valorOrcado + ", valorOrcadoGrupo=" + valorOrcadoGrupo + ", valorTotalOrcado="
				+ valorTotalOrcado + "]";
	}

}
