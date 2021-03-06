package entity;

public class Programa {

	private String codigo;
	private String descricao;

	public Programa() {

	}

	public Programa(String codigo, String descricao) {
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
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Programa [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
