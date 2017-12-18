package entity;

public class SubFuncao {

	private Integer codigo;
	private String descricao;
	
	public SubFuncao() {
		// TODO Auto-generated constructor stub
	}

	public SubFuncao(Integer codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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
		return "SubFuncao [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
