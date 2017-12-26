package entity;

public class UnidadeOrcamentaria {

	private String codigo;
	private String descricao;

	public UnidadeOrcamentaria() {
		// TODO Auto-generated constructor stub
	}

	public UnidadeOrcamentaria(String codigo, String descricao) {
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
		return "UnidadeOrcamentaria [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
