package persistence;

import control.ControleAdicionarMascara;
import entity.SubElemento;

public class DaoSubElemento extends Dao  {

	
	public SubElemento findByCode(Integer exercicio, String codigo) throws Exception {
		open(exercicio);
		SubElemento subElemento = null;

		String sql = "SELECT CODIGO, descricao as SubElemento";
		sql = sql + " FROM DESPECOD ";
		sql = sql + " WHERE CODIGO = ? ";

		stmt = con.prepareStatement(sql);
		stmt.setString(1, ControleAdicionarMascara.addZero(0, 0, codigo));
		rs = stmt.executeQuery();
		if (rs.next()) {
			subElemento = new SubElemento();
			subElemento.setCodigo(ControleAdicionarMascara.addPontos("grupo_despesa", rs.getString("CODIGO")));
			subElemento.setDescricao(rs.getString("SubElemento").toUpperCase());
		}

		close();
		return subElemento;
	}
}
