package entity;

public class Empenho {

	private Integer numeroEmpenho;
	private String dataEmpenho;
	private String nomeCredor;
	private String observacao;
	private Double valorEmpenhado;
	private Double valorLiquidado;
	private Double valorPago;

	public Empenho() {
		// TODO Auto-generated constructor stub
	}

	public Empenho(Integer numeroEmpenho, String dataEmpenho, String nomeCredor, String observacao,
			Double valorEmpenhado, Double valorLiquidado, Double valorPago) {
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

	public Double getValorEmpenhado() {
		return valorEmpenhado;
	}

	public void setValorEmpenhado(Double valorEmpenhado) {
		this.valorEmpenhado = valorEmpenhado;
	}

	public Double getValorLiquidado() {
		return valorLiquidado;
	}

	public void setValorLiquidado(Double valorLiquidado) {
		this.valorLiquidado = valorLiquidado;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	@Override
	public String toString() {
		return "Empenho [numeroEmpenho=" + numeroEmpenho + ", dataEmpenho=" + dataEmpenho + ", nomeCredor=" + nomeCredor
				+ ", observacao=" + observacao + ", valorEmpenhado=" + valorEmpenhado + ", valorLiquidado="
				+ valorLiquidado + ", valorPago=" + valorPago + "]";
	}

}
