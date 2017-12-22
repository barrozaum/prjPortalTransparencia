package persistence;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import control.ControleAdicionarMascara;
import dto.OrcamentoDespesaFonteRecurso;
import entity.FonteRecurso;

public class DaoOrcamentoDespesaFonteRecurso extends Dao {

	public List<OrcamentoDespesaFonteRecurso> relatorioDespesaFonteRecurso(Integer exercicio, Integer unidadeGestora) throws Exception {
		List<OrcamentoDespesaFonteRecurso> lista = new ArrayList<>();
		open(exercicio);
		String sql = "SELECT f.CODIGO, f.DESCRICAO, SUM(DESPESA_FIXADA) as VALOR_ORCADO ";
		sql = sql + " FROM DESPESA d, FONTE f ";
		sql = sql + " WHERE  d.Cod_UnidadeGestora = ? ";
		sql = sql + " AND   d.FONTE_RECURSO = f.CODIGO";
		sql = sql + " group by f.CODIGO, f.DESCRICAO";
		sql = sql + " order by f.CODIGO";

		stmt = con.prepareStatement(sql);
		stmt.setInt(1, unidadeGestora);
		rs = stmt.executeQuery();
		OrcamentoDespesaFonteRecurso odfr = null;
		Double valorTotalCalculado = 0.;
		while (rs.next()) {
			odfr = new OrcamentoDespesaFonteRecurso();
			FonteRecurso fr = new FonteRecurso();
			fr.setCodigo(rs.getString("CODIGO"));
			fr.setNome(rs.getString("DESCRICAO"));
			odfr.setFonte(fr);
			odfr.setValorOrcado(ControleAdicionarMascara.formataDataReal(rs.getString("VALOR_ORCADO")));
			odfr.setExercicioOrcamento(exercicio);

			// CALCULO VALOR TOTAL
			valorTotalCalculado += rs.getDouble("VALOR_ORCADO");
			lista.add(odfr);
		}
		if (odfr != null) {
			odfr.setValorTotalOrcado(NumberFormat.getCurrencyInstance().format(valorTotalCalculado));
		}

		close();
		return lista;
	}

}
