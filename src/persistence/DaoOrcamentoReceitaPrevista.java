package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import control.ControleAdicionarMascara;
import dto.OrcamentoDespesaGrupoDespesa;
import dto.OrcamentoReceita;
import entity.Categoria;
import entity.Elemento;
import entity.Modalidade;
import entity.Natureza;
import entity.Nivel;
import entity.SubElemento;
import entity.UnidadeGestora;

public class DaoOrcamentoReceitaPrevista extends Dao {

	public List<OrcamentoReceita> relatorioOrcamentoReceitaPrevista(Integer exercicio, Integer unidadeGestora)
			throws Exception {
		List<OrcamentoReceita> lista = new ArrayList<>();
		open(exercicio);
		String sql = "SELECT r.CODIGO as codigo ,u.Desc_UnidadeGestora as unidade_gestora,";
		sql = sql + " SUBSTRING(r.CODIGO, 1, 1) AS nivel1 ,   ";
		sql = sql + " SUBSTRING(r.CODIGO, 1, 2) AS nivel2,  ";
		sql = sql + " SUBSTRING(r.CODIGO, 1, 3) AS nivel3,  ";
		sql = sql + " SUBSTRING(r.CODIGO, 1, 4) AS nivel4,  ";
		sql = sql + " SUBSTRING(r.CODIGO, 1, 6) AS nivel5,  ";
		sql = sql + " SUBSTRING(r.CODIGO, 1, 8) AS nivel6,  ";
		sql = sql + " SUBSTRING(r.CODIGO, 1, 10) AS nivel7,  ";
		sql = sql + " SUM(r.RECEITA_PREVISTA) as valor_orcado ";
		sql = sql + " FROM RECEITA r, UNIDADEGESTORA u  ";
		sql = sql + " WHERE r.Cod_UnidadeGestora = ?";
		sql = sql + " AND  r.Cod_UnidadeGestora = u.Cod_UnidadeGestora";
		sql = sql + " GROUP BY r.CODIGO ,u.Desc_UnidadeGestora  ";
		sql = sql + " ORDER BY CODIGO  ";

		stmt = con.prepareStatement(sql);
		stmt.setInt(1, unidadeGestora);
		rs = stmt.executeQuery();
		Double valorTotalCalculado = 0.;
		OrcamentoReceita orcamento = null;

		while (rs.next()) {
			// instanciando objetos
			orcamento = new OrcamentoReceita();
			orcamento.setExercicioOrcamento(exercicio);
			// Unidade Gestora
			UnidadeGestora ug = new UnidadeGestora();
			ug.setCodUnidadeGestora(unidadeGestora);
			ug.setDescricaoUnidade(rs.getString("unidade_gestora"));
			orcamento.setUnidadeGestora(ug);
			// Lista de niveis da conta
			List<Nivel> listaNivel = new ArrayList<Nivel>();
			Nivel nivel1 = new Nivel();
			nivel1.setCodigo(rs.getString("nivel1"));
			Nivel nivel2 = new Nivel();
			nivel2.setCodigo(rs.getString("nivel2"));
			Nivel nivel3 = new Nivel();
			nivel3.setCodigo(rs.getString("nivel3"));
			Nivel nivel4 = new Nivel();
			nivel4.setCodigo(rs.getString("nivel4"));
			Nivel nivel5 = new Nivel();
			nivel5.setCodigo(rs.getString("nivel5"));
			Nivel nivel6 = new Nivel();
			nivel6.setCodigo(rs.getString("nivel6"));
			Nivel nivel7 = new Nivel();
			nivel7.setCodigo(rs.getString("nivel7"));
			nivel7.setValorOrcado(ControleAdicionarMascara.formataDataReal(rs.getString("valor_orcado")));

			listaNivel.add(nivel1);
			listaNivel.add(nivel2);
			listaNivel.add(nivel3);
			listaNivel.add(nivel4);
			listaNivel.add(nivel5);
			listaNivel.add(nivel6);
			listaNivel.add(nivel7);
			orcamento.setListaNivel(listaNivel);

			// CALCULO VALOR TOTAL
			valorTotalCalculado += rs.getDouble("valor_orcado");
			lista.add(orcamento);

		}
		if (orcamento != null) {
			orcamento.setValorTotalOrcado(ControleAdicionarMascara.formataDataReal(valorTotalCalculado.toString()));
		}

		close();
		return lista;
	}

	public void verificarDescricaoNivel(Integer exercicio, OrcamentoReceita orcamentoReceita) throws Exception {
		DaoNivel d = new DaoNivel();
		for (Nivel nivel : orcamentoReceita.getListaNivel()) {
			d.buscarNivel(exercicio, nivel);
		}

	}
	
	public void verificarValorOrcadoReceita(Integer exercicio, Integer unidade , Nivel nivel, Integer posicao) throws Exception{
		DaoNivel d = new DaoNivel();
		d.verificarValorOrcadoPorGrupoReceita(exercicio, unidade, nivel, posicao);
	
	}
	
}
