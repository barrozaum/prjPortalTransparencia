package entity;

public class FonteRecurso {

	private String codigo;
	private String nome;

	public FonteRecurso() {
	}

	public FonteRecurso(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "FonteRecurso [codigo=" + codigo + ", nome=" + nome + "]";
	};

}
