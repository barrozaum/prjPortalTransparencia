package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.UnidadeGestora;

public class DaoUnidadeGestora extends Dao {

	public UnidadeGestora findByCode(Integer exercicio, Integer cod) throws Exception {
		open(exercicio);
		UnidadeGestora unidade = null;
		stmt = con.prepareStatement("SELECT * FROM UNIDADEGESTORA WHERE Cod_UnidadeGestora = ?");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		if (rs.next()) {
			unidade = new UnidadeGestora();
			unidade.setCodUnidadeGestora(rs.getInt("Cod_UnidadeGestora"));
			unidade.setDescricaoUnidade(rs.getString("Desc_UnidadeGestora"));
		}
		stmt.close();
		close();
		return unidade;
	}

	public List<UnidadeGestora> findAll(Integer exercicio) throws Exception {
		open(exercicio);
		List<UnidadeGestora> listaUnidadeGestora = new ArrayList<UnidadeGestora>();
		stmt = con.prepareStatement("SELECT * FROM UNIDADEGESTORA ");
		rs = stmt.executeQuery();
		while (rs.next()) {
			UnidadeGestora unidade = new UnidadeGestora();
			unidade.setCodUnidadeGestora(rs.getInt("Cod_UnidadeGestora"));
			unidade.setDescricaoUnidade(rs.getString("Desc_UnidadeGestora"));
			listaUnidadeGestora.add(unidade);
		}

		stmt.close();
		close();
		return listaUnidadeGestora;
	}
}
