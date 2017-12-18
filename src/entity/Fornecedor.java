package entity;

public class Fornecedor {

	private Integer codigo;
	private Integer unidadeGestora;
	private String nome;
	private String cpf;
	private String cnpj;

	public Fornecedor() {

	}

	public Fornecedor(Integer codigo, Integer unidadeGestora, String nome, String cpf, String cnpj) {
		super();
		this.codigo = codigo;
		this.unidadeGestora = unidadeGestora;
		this.nome = nome;
		this.cpf = cpf;
		this.cnpj = cnpj;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getUnidadeGestora() {
		return unidadeGestora;
	}

	public void setUnidadeGestora(Integer unidadeGestora) {
		this.unidadeGestora = unidadeGestora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Fornecedores [codigo=" + codigo + ", unidadeGestora=" + unidadeGestora + ", nome=" + nome + ", cpf="
				+ cpf + ", cnpj=" + cnpj + "]";
	}

}
