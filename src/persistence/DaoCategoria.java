package persistence;

import control.ControleAdicionarMascara;
import entity.Categoria;

public class DaoCategoria extends Dao {

	public Categoria findByCode(Integer exercicio, String codigo) throws Exception {
		open(exercicio);
		Categoria categoria = null;

		String sql = "SELECT CODIGO, descricao as CATEGORIA";
		sql = sql + " FROM DESPECOD ";
		sql = sql + " WHERE CODIGO = ? ";

		stmt = con.prepareStatement(sql);
		stmt.setString(1, ControleAdicionarMascara.addZero(0,7, codigo));
		
	
		rs = stmt.executeQuery();
		if (rs.next()) {
			categoria = new Categoria();
			categoria.setCodigo(ControleAdicionarMascara.addPontos("grupo_despesa", rs.getString("CODIGO")));
			categoria.setDescricao(rs.getString("CATEGORIA").toUpperCase());
		}

		close();
		return categoria;
	}

}
