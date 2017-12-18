package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Funcao;

public class DaoFuncao extends Dao {

	public List<Funcao> findFuncaoByUnidadeGestora(Integer exercicio, Integer codigoUnidadeGestora) throws Exception {
		open(exercicio);
		List<Funcao> listarFuncoes = new ArrayList<Funcao>();
		String sql = "SELECT  f.CODIGO, f.DESCRICAO";
		sql = sql + " FROM DESPESA d, FUNCAO f";
		sql = sql + " WHERE  d.funcao = f.codigo";
		sql = sql + " AND   d.cod_unidadegestora = ?";
		sql = sql + " group by f.CODIGO, f.DESCRICAO ";
		sql = sql + " order by f.DESCRICAO ";
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, codigoUnidadeGestora);
		rs = stmt.executeQuery();
		while (rs.next()) {
			Funcao f = new Funcao();
			f.setCodigo(rs.getInt("CODIGO"));
			f.setDescricao(rs.getString("DESCRICAO"));

			listarFuncoes.add(f);
		}
		stmt.close();

		close();
		return listarFuncoes;
	}


}
