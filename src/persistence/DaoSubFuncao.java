package persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Funcao;
import entity.SubFuncao;

public class DaoSubFuncao extends Dao {

	public List<SubFuncao> findSubFuncaoByUnidadeGestoraFuncao(Integer exercicio, Integer codigoUnidadeGestora,
			Integer codigoFuncao) throws Exception {
		open(exercicio);
		List<SubFuncao> listarSubFuncoes = new ArrayList<SubFuncao>();
		String sql = "SELECT  sb.CODIGO, sb.DESCRICAO ";
		sql = sql + " FROM DESPESA d, FUNCAO f, SUBFUNCAO sb";
		sql = sql + " WHERE  d.funcao = ?";
		sql = sql + " AND   d.cod_unidadegestora = ?";
		sql = sql + " and   d.subfuncao = sb.codigo ";

		sql = sql + " group by sb.CODIGO, sb.DESCRICAO ";
		sql = sql + " order by sb.DESCRICAO ";

		stmt = con.prepareStatement(sql);
		stmt.setInt(1, codigoFuncao);
		stmt.setInt(2, codigoUnidadeGestora);
		rs = stmt.executeQuery();
		while (rs.next()) {
			SubFuncao sf = new SubFuncao();
			sf.setCodigo(rs.getInt("CODIGO"));
			sf.setDescricao(rs.getString("DESCRICAO"));

			listarSubFuncoes.add(sf);
		}
		stmt.close();

		close();
		return listarSubFuncoes;

	}
}
