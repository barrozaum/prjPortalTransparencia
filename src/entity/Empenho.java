package entity;

public class Empenho {

	private Integer numeroEmpenho;
	private String dataEmpenho;
	private String nomeCredor;
	private String observacao;
	private String valorEmpenhado;
	private String valorLiquidado;
	private String valorPago;

	public Empenho() {
		// TODO Auto-generated constructor stub
	}

	public Empenho(Integer numeroEmpenho, String dataEmpenho, String nomeCredor, String observacao,
			String valorEmpenhado, String valorLiquidado, String valorPago) {
		super();
		this.numeroEmpenho = numeroEmpenho;
		this.dataEmpenho = dataEmpenho;
		this.nomeCredor = nomeCredor;
		this.observacao = observacao;
		this.valorEmpenhado = valorEmpenhado;
		this.valorLiquidado = valorLiquidado;
		this.valorPago = valorPago;
	}

	public Integer getNumeroEmpenho() {
		return numeroEmpenho;
	}

	public void setNumeroEmpenho(Integer numeroEmpenho) {
		this.numeroEmpenho = numeroEmpenho;
	}

	public String getDataEmpenho() {
		return dataEmpenho;
	}

	public void setDataEmpenho(String dataEmpenho) {
		this.dataEmpenho = dataEmpenho;
	}

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getValorEmpenhado() {
		return valorEmpenhado;
	}

	public void setValorEmpenhado(String valorEmpenhado) {
		this.valorEmpenhado = valorEmpenhado;
	}

	public String getValorLiquidado() {
		return valorLiquidado;
	}

	public void setValorLiquidado(String valorLiquidado) {
		this.valorLiquidado = valorLiquidado;
	}

	public String getValorPago() {
		return valorPago;
	}

	public void setValorPago(String valorPago) {
		this.valorPago = valorPago;
	}

	@Override
	public String toString() {
		return "Empenho [numeroEmpenho=" + numeroEmpenho + ", dataEmpenho=" + dataEmpenho + ", nomeCredor=" + nomeCredor
				+ ", observacao=" + observacao + ", valorEmpenhado=" + valorEmpenhado + ", valorLiquidado="
				+ valorLiquidado + ", valorPago=" + valorPago + "]";
	}

}
