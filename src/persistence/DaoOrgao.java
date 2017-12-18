package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Orgao;

public class DaoOrgao extends Dao {

	// buscando pelo código do orgao
	public Orgao findByCode(Integer exercicio, Integer cod) throws Exception {
		open(exercicio);
		Orgao orgao = null;
		stmt = con.prepareStatement("SELECT * FROM ORGAO WHERE codigo = ?");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		if (rs.next()) {
			orgao = new Orgao();
			orgao.setCodigo(rs.getInt("CODIGO"));
			orgao.setDescricao(rs.getString("DESCRICAO"));
			orgao.setPoder(rs.getString("PODER"));
			orgao.setUnidadeGestora(rs.getInt("Cod_UnidadeGestora"));
		}
		stmt.close();
		close();
		return orgao;
	}

	// buscando pelo código do orgao
	public List<Orgao> findByCodeUnidadeGestora(Integer exercicio, Integer cod) throws Exception {
		open(exercicio);
		List<Orgao> listaOrgao = new ArrayList<Orgao>();
		stmt = con.prepareStatement("SELECT * FROM ORGAO WHERE Cod_UnidadeGestora = ?");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		while (rs.next()) {
			Orgao orgao = new Orgao();
			orgao.setCodigo(rs.getInt("CODIGO"));
			orgao.setDescricao(rs.getString("DESCRICAO"));
			orgao.setPoder(rs.getString("PODER"));
			orgao.setUnidadeGestora(rs.getInt("Cod_UnidadeGestora"));
			listaOrgao.add(orgao);
		}
		stmt.close();
		close();
		return listaOrgao;
	}

	// buscando todos os orgaos
	public List<Orgao> findAll(Integer exercicio) throws Exception {
		open(exercicio);
		List<Orgao> listaOrgao = new ArrayList<Orgao>();
		stmt = con.prepareStatement("SELECT * FROM ORGAO");
		rs = stmt.executeQuery();
		while (rs.next()) {
			Orgao orgao = new Orgao();
			orgao.setCodigo(rs.getInt("CODIGO"));
			orgao.setDescricao(rs.getString("DESCRICAO"));
			orgao.setPoder(rs.getString("PODER"));
			orgao.setUnidadeGestora(rs.getInt("Cod_UnidadeGestora"));
			listaOrgao.add(orgao);
		}
		stmt.close();
		close();
		return listaOrgao;
	}

}
