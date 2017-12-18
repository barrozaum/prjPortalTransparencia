package entity;

public class UnidadeGestora {

	private Integer codUnidadeGestora;
	private String descricaoUnidade;

	public UnidadeGestora() {

	}

	public UnidadeGestora(Integer codUnidadeGestora, String descricaoUnidade) {
		super();
		this.codUnidadeGestora = codUnidadeGestora;
		this.descricaoUnidade = descricaoUnidade;
	}

	public Integer getCodUnidadeGestora() {
		return codUnidadeGestora;
	}

	public void setCodUnidadeGestora(Integer codUnidadeGestora) {
		this.codUnidadeGestora = codUnidadeGestora;
	}

	public String getDescricaoUnidade() {
		return descricaoUnidade.toUpperCase();
	}

	public void setDescricaoUnidade(String descricaoUnidade) {
		this.descricaoUnidade = descricaoUnidade;
	}

	@Override
	public String toString() {
		return "UnidadeGestora [codUnidadeGestora=" + codUnidadeGestora + ", descricaoUnidade=" + descricaoUnidade
				+ "]";
	}

}
