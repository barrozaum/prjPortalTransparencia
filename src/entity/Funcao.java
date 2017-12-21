package entity;

public class Funcao {

	private String codigo;
	private String descricao;

	public Funcao() {
		// TODO Auto-generated constructor stub
	}

	public Funcao(String codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao.toUpperCase();
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Funcao [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
