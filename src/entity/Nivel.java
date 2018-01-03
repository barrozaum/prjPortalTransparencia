package entity;

public class Nivel {

	private String codigo;
	private String descricao;
	private String valorOrcado;

	public Nivel() {
		// TODO Auto-generated constructor stub
	}

	public Nivel(String codigo, String descricao, String valorOrcado) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorOrcado = valorOrcado;
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

	public String getValorOrcado() {
		return valorOrcado;
	}

	public void setValorOrcado(String valorOrcado) {
		this.valorOrcado = valorOrcado;
	}

	@Override
	public String toString() {
		return "Nivel [codigo=" + codigo + ", descricao=" + descricao + ", valorOrcado=" + valorOrcado + "]";
	}

}
