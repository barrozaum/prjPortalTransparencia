package persistence;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import control.ControleAdicionarMascara;
import dto.OrcamentoDespesaFuncaoSubFuncao;
import entity.Funcao;
import entity.SubFuncao;

public class DaoOrcamentoDespesaFuncaoSubFuncao extends Dao {

	public List<OrcamentoDespesaFuncaoSubFuncao> relatorioOrcamentoFuncaoSubFuncao(Integer exercicio,
			Integer unidadeGestora, Integer codigoFuncao, Integer codigoSubFuncao) throws Exception {

		List<OrcamentoDespesaFuncaoSubFuncao> lista = new ArrayList<OrcamentoDespesaFuncaoSubFuncao>();
		open(exercicio);
		String sql = "SELECT f.codigo as codigoFuncao,";
		sql = sql + " f.descricao as desricaoFuncao,";
		sql = sql + " s.codigo as codigoSubFuncao,";
		sql = sql + " s.descricao as descricaoSubFuncao,";
		sql = sql + "	SUM(d.DESPESA_FIXADA) as total";
		sql = sql + "	FROM despesa d, funcao f, subfuncao s";
		sql = sql + "	WHERE d.funcao = f.codigo";
		if (codigoFuncao > 0) {
			sql = sql + " AND f.codigo = ?";
		}
		sql = sql + "	AND d.subfuncao = s.codigo";

		if (codigoSubFuncao > 0) {
			sql = sql + "	AND s.codigo = ?";
		}

		if (unidadeGestora != 9999) {
			sql = sql + "	AND    d.cod_unidadegestora = ?";
		}
		sql = sql + "	group by f.codigo,";
		sql = sql + "	f.descricao,";
		sql = sql + "	s.codigo,";
		sql = sql + "	s.descricao";
		sql = sql + "	order by f.codigo";

		stmt = con.prepareStatement(sql);
		int i = 0;
		if (codigoFuncao > 0) {
			stmt.setInt(++i, codigoFuncao);
		}
		if (codigoSubFuncao > 0) {
			stmt.setInt(++i, codigoSubFuncao);
		}
		if (unidadeGestora != 9999) {
			stmt.setInt(++i, unidadeGestora);
		}
		rs = stmt.executeQuery();
		OrcamentoDespesaFuncaoSubFuncao odfs = null;
		Double valorTotalCalculado = 0.;
		while (rs.next()) {
			odfs = new OrcamentoDespesaFuncaoSubFuncao();
			odfs.setUnidadeGestora(new DaoUnidadeGestora().findByCode(exercicio, unidadeGestora));
			Funcao funcao = new Funcao();
			SubFuncao sb = new SubFuncao();
			funcao.setCodigo(rs.getString("codigoFuncao"));
			funcao.setDescricao(rs.getString("desricaoFuncao"));
			sb.setCodigo(rs.getInt("codigoSubFuncao"));
			sb.setDescricao(rs.getString("descricaoSubFuncao"));
			odfs.setFuncao(funcao);
			odfs.setSubFuncao(sb);
			odfs.setValor(ControleAdicionarMascara.formataDataReal(rs.getString("total")));
			odfs.setExercicioOrcamento(exercicio);
			lista.add(odfs);
			valorTotalCalculado += rs.getDouble("total");
		}
		if (odfs != null) {
			odfs.setValorTotalOrcado(ControleAdicionarMascara.formataDataReal(valorTotalCalculado.toString()));
		}
		close();

		return lista;
	}
}
