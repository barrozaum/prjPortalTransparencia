package entity;

public class UnidadeExecutora {

	private String codigo;
	private String descricao;

	public UnidadeExecutora() {
		// TODO Auto-generated constructor stub
	}

	public UnidadeExecutora(String codigo, String descricao) {
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
		return "UnidadeExecutora [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
