package persistence;

import control.ControleAdicionarMascara;
import entity.Natureza;

public class DaoNatureza extends Dao {

	public Natureza findByCode(Integer exercicio, String codigo) throws Exception {
		open(exercicio);
		Natureza natureza = null;

		String sql = "SELECT CODIGO, descricao as Natureza";
		sql = sql + " FROM DESPECOD ";
		sql = sql + " WHERE CODIGO = ? ";

		stmt = con.prepareStatement(sql);
		stmt.setString(1, ControleAdicionarMascara.addZero(0, 6, codigo));
		rs = stmt.executeQuery();
		if (rs.next()) {
			natureza = new Natureza();
			natureza.setCodigo(ControleAdicionarMascara.addPontos("grupo_despesa", rs.getString("CODIGO")));
			natureza.setDescricao(rs.getString("Natureza").toUpperCase());
		}

		close();
		return natureza;
	}

}
