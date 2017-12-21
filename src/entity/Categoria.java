package entity;

public class Categoria {

	private String codigo;
	private String descricao;

	public Categoria() {

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
		return "Categoria [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
