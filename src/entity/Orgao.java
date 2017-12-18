package entity;

public class Orgao {

	private Integer codigo;
	private String descricao;
	private String poder;
	private Integer unidadeGestora;

	public Orgao() {
		// TODO Auto-generated constructor stub
	}

	public Orgao(Integer codigo, String descricao, String poder, Integer unidadeGestora) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.poder = poder;
		this.unidadeGestora = unidadeGestora;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public Integer getUnidadeGestora() {
		return unidadeGestora;
	}

	public void setUnidadeGestora(Integer unidadeGestora) {
		this.unidadeGestora = unidadeGestora;
	}

	@Override
	public String toString() {
		return "Orgao [codigo=" + codigo + ", descricao=" + descricao + ", poder=" + poder + ", unidadeGestora="
				+ unidadeGestora + "]";
	}

}
