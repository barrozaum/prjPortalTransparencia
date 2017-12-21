package persistence;

import control.ControleAdicionarMascara;
import entity.Modalidade;

public class DaoModalidade extends Dao  {

	
	public Modalidade findByCode(Integer exercicio, String codigo) throws Exception {
		open(exercicio);
		Modalidade modalidade = null;

		String sql = "SELECT CODIGO, descricao as Modalidade";
		sql = sql + " FROM DESPECOD ";
		sql = sql + " WHERE CODIGO = ? ";

		stmt = con.prepareStatement(sql);
		stmt.setString(1, ControleAdicionarMascara.addZero(0, 4, codigo));
		rs = stmt.executeQuery();
		if (rs.next()) {
			modalidade = new Modalidade();
			modalidade.setCodigo(ControleAdicionarMascara.addPontos("grupo_despesa", rs.getString("CODIGO")));
			modalidade.setDescricao(rs.getString("Modalidade").toUpperCase());
		}

		close();
		return modalidade;
	}
}
