package manager;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import entity.Orgao;
import persistence.DaoOrgao;

@ManagedBean
public class ManagerOrgao {

	private Orgao orgao;
	private List<Orgao> listaOrgao;

	public ManagerOrgao() {

	}

	public ManagerOrgao(Orgao orgao, List<Orgao> listaOrgao) {
		super();
		this.orgao = orgao;
		this.listaOrgao = listaOrgao;
	}

	public Orgao getOrgao() {
		return orgao;
	}

	public void setpOrgao(Orgao orgao) {
		this.orgao = orgao;
	}

	public List<Orgao> getListaOrgao() {
		return listaOrgao;
	}

	public void setListaOrgao(List<Orgao> listaOrgao) {
		this.listaOrgao = listaOrgao;
	}

	public List<Orgao> findAllOrgao() {
		List<Orgao> lista = new ArrayList<Orgao>();
		try {
			lista = new DaoOrgao().findAll(2016);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public String toString() {
		return "ManagerOrgao [orgao=" + orgao + ", listaOrgao=" + listaOrgao + "]";
	}

}
