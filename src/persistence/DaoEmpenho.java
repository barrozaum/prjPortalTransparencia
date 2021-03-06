package persistence;

import java.util.ArrayList;
import java.util.List;

import control.ControleAdicionarMascara;
import entity.Empenho;

public class DaoEmpenho extends Dao {

	public List<Empenho> lrfDespesaDetalhada(Integer exercicio, Integer codUnidadeGestora, String observacao)
			throws Exception {
		open(exercicio);
		List<Empenho> listaEmpenhos = new ArrayList<>();
		String sql = "SELECT E.NR_EMPENHO, E.DATA_EMPENHO, E.OBSERVACAO, E.VALOR_EMPENHO, F.NOME ";
		sql = sql + " FROM EMPENHO E, FORCAD F";
		sql = sql + " WHERE E.Cod_UnidadeGestora  = ?";
		sql = sql + " AND E.observacao like ?";
		sql = sql + " AND E.FORNECEDOR = F.CODIGO";

		stmt = con.prepareStatement(sql);
		stmt.setInt(1, codUnidadeGestora);
		stmt.setString(2, "%" + observacao + "%");
		rs = stmt.executeQuery();
		while (rs.next()) {
			Empenho e = new Empenho();
			e.setNumeroEmpenho(rs.getInt("NR_EMPENHO"));
			e.setDataEmpenho(ControleAdicionarMascara.dataBrasileira(rs.getString("DATA_EMPENHO")));
			e.setNomeCredor(rs.getString("NOME"));
			e.setObservacao(rs.getString("OBSERVACAO"));
			e.setValorEmpenhado(ControleAdicionarMascara.formataDataReal(rs.getString("VALOR_EMPENHO")));
			e.setValorPago(ControleAdicionarMascara.formataDataReal(rs.getString("VALOR_EMPENHO")));

			listaEmpenhos.add(e);
		}
		close();
		return listaEmpenhos;
	}

	public void valorLiquidoEmpenho(Integer exercicio, Empenho e) throws Exception {
		open(exercicio);
		String sqlLiquido = "SELECT SUM(VLR_LIQUIDADO) as TOTAL";
		sqlLiquido = sqlLiquido + " FROM  LIQUIDACAO WHERE EMPENHO = ?";
		stmt = con.prepareStatement(sqlLiquido);
		stmt.setInt(1, e.getNumeroEmpenho());
		rs = stmt.executeQuery();
		if (rs.next()) {
			e.setValorLiquidado(ControleAdicionarMascara.formataDataReal(rs.getString("TOTAL")));
		}

		String sqlPago = "SELECT SUM(VALOR) as TOTAL";
		sqlPago = sqlPago + " FROM  PAGTOEMP WHERE EMPENHO = ?";
		stmt = con.prepareStatement(sqlPago);
		stmt.setInt(1, e.getNumeroEmpenho());
		rs = stmt.executeQuery();
		if (rs.next()) {
			e.setValorPago(ControleAdicionarMascara.formataDataReal(rs.getString("TOTAL")));
		}
		close();
	}

}
