package persistence;

import control.ControleAdicionarMascara;
import entity.Nivel;

public class DaoNivel extends Dao {

	public void buscarNivel(Integer exercicio, Nivel nivel) throws Exception {
		open(exercicio);
		String sql = "SELECT R.CODIGO, R.DESCRICAO, R.NIVEL ";
		sql = sql + " FROM  RECEICOD as r";
		sql = sql + " WHERE r.CODIGO = ?";

		stmt = con.prepareStatement(sql);
		stmt.setString(1, ControleAdicionarMascara.addZeroPeloTamanho(10, nivel.getCodigo()));
		rs = stmt.executeQuery();
		if (rs.next()) {
			nivel.setDescricao(rs.getString("DESCRICAO"));
		}
		nivel.setCodigo(ControleAdicionarMascara.addPontos("receita_prevista",
				ControleAdicionarMascara.addZeroPeloTamanho(10, nivel.getCodigo())));
		close();
	}

	public void verificarValorOrcadoPorGrupoReceita(Integer exercicio, Integer unidadeGestora, Nivel nivel,
			Integer posicao) throws Exception {
		open(exercicio);
		String comparativo = "";

		if (posicao == 0) {
			comparativo = ControleAdicionarMascara.retirarPontos(nivel.getCodigo()).substring(0, 1) + "%";
		} else if (posicao == 1) {
			comparativo = ControleAdicionarMascara.retirarPontos(nivel.getCodigo()).substring(0, 2) + "%";
		} else if (posicao == 2) {
			comparativo = ControleAdicionarMascara.retirarPontos(nivel.getCodigo()).substring(0, 3) + "%";
		} else if (posicao == 3) {
			comparativo = ControleAdicionarMascara.retirarPontos(nivel.getCodigo()).substring(0, 4) + "%";
		} else if (posicao == 4) {
			comparativo = ControleAdicionarMascara.retirarPontos(nivel.getCodigo()).substring(0, 6) + "%";
		} else if (posicao == 5) {
			comparativo = ControleAdicionarMascara.retirarPontos(nivel.getCodigo()).substring(0, 8) + "%";
		} else if (posicao == 6) {
			comparativo = ControleAdicionarMascara.retirarPontos(nivel.getCodigo()).substring(0, 10) + "%";
		}

		String sql = "SELECT r.CODIGO as codigo, ";
		sql = sql + " SUM(r.RECEITA_PREVISTA) as valor_orcado ";
		sql = sql + " FROM RECEITA r ";
		sql = sql + " WHERE r.Cod_UnidadeGestora = ?";
		sql = sql + " AND r.CODIGO like ? ";
		sql = sql + " GROUP BY r.CODIGO ";
		sql = sql + " ORDER BY CODIGO  ";

		stmt = con.prepareStatement(sql);
		stmt.setInt(1, unidadeGestora);
		stmt.setString(2, comparativo);
		rs = stmt.executeQuery();
		Double valorTotalGrupo = 0.;
		while (rs.next()) {
			valorTotalGrupo += rs.getDouble("valor_orcado");
		}
		nivel.setValorOrcado(ControleAdicionarMascara.formataDataReal(valorTotalGrupo.toString()));
	}
}
