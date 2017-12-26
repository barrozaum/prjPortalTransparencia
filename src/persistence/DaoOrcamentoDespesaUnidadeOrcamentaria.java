package persistence;

import java.util.ArrayList;
import java.util.List;

import control.ControleAdicionarMascara;
import dto.OrcamentoDespesaUnidadeOrcamentaria;
import entity.UnidadeExecutora;
import entity.UnidadeOrcamentaria;

public class DaoOrcamentoDespesaUnidadeOrcamentaria extends Dao {

	public List<OrcamentoDespesaUnidadeOrcamentaria> relatorioDespesaUnidadeOrcamentaria(Integer exercicio,
			Integer unidadeGestora) throws Exception {
		List<OrcamentoDespesaUnidadeOrcamentaria> lista = new ArrayList<>();
		open(exercicio);
		String sql = "SELECT o.CODIGO codigo_orgao, o.DESCRICAO descricao_orgao,";
		sql = sql + " u.CODIGO codigo_unidade, u.DESCRICAO descricao_unidade,	sum(d.DESPESA_FIXADA) valor_orcado ";
		sql = sql + " FROM despesa d, orgao o, UNIDADE u ";
		sql = sql + " WHERE  d.Cod_UnidadeGestora = ? ";
		sql = sql + " AND   d.COD_UNIDADE = u.CODIGO";
		sql = sql + " AND   d.Cod_UnidadeGestora = o.Cod_UnidadeGestora";
		sql = sql + " AND   u.ORGAO = o.CODIGO ";
		sql = sql + " group by o.CODIGO,  o.DESCRICAO, u.CODIGO, u.DESCRICAO";
		sql = sql + " order by o.CODIGO, u.CODIGO";

		stmt = con.prepareStatement(sql);
		stmt.setInt(1, unidadeGestora);
		rs = stmt.executeQuery();
		OrcamentoDespesaUnidadeOrcamentaria oduo = null;
		Double valorTotalOrcado = 0.;
		while (rs.next()) {
			oduo = new OrcamentoDespesaUnidadeOrcamentaria();
			UnidadeExecutora ue = new UnidadeExecutora();
			ue.setCodigo(rs.getString("codigo_orgao"));
			ue.setDescricao(rs.getString("descricao_orgao"));
			UnidadeOrcamentaria uo = new UnidadeOrcamentaria();
			uo.setCodigo(rs.getString("codigo_unidade"));
			uo.setDescricao(rs.getString("descricao_unidade"));
			oduo.setExercicioOrcamento(exercicio);
			oduo.setUnidadeExecutora(ue);
			oduo.setUnidadeOrcamentaria(uo);
			oduo.setValorOrcado(ControleAdicionarMascara.formataDataReal(rs.getString("valor_orcado")));

			valorTotalOrcado += rs.getDouble("valor_orcado");

			lista.add(oduo);
		}
		if (oduo != null) {
			oduo.setValorTotalOrcado(ControleAdicionarMascara.formataDataReal(valorTotalOrcado.toString()));
		}

		close();
		return lista;
	}
}
