package persistence;

import control.ControleAdicionarMascara;
import entity.Elemento;

public class DaoElemento extends Dao  {

	
	public Elemento findByCode(Integer exercicio, String codigo) throws Exception {
		open(exercicio);
		Elemento elemento = null;

		String sql = "SELECT CODIGO, descricao as Elemento";
		sql = sql + " FROM DESPECOD ";
		sql = sql + " WHERE CODIGO = ? ";

		stmt = con.prepareStatement(sql);
		stmt.setString(1, ControleAdicionarMascara.addZero(0, 2, codigo));
		rs = stmt.executeQuery();
		if (rs.next()) {
			elemento = new Elemento();
			elemento.setCodigo(ControleAdicionarMascara.addPontos("grupo_despesa", rs.getString("CODIGO")));
			elemento.setDescricao(rs.getString("Elemento").toUpperCase());
		}

		close();
		return elemento;
	}
}
