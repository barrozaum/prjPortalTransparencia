package persistence;

import java.util.ArrayList;
import java.util.List;

import control.ControleAdicionarMascara;
import dto.OrcamentoDespesaGrupoDespesa;
import entity.Categoria;
import entity.Elemento;
import entity.Modalidade;
import entity.Natureza;
import entity.SubElemento;
import entity.UnidadeGestora;

public class DaoOrcamentoDespesaGrupoDespesa extends Dao {

	public List<OrcamentoDespesaGrupoDespesa> relatorioOrcamentoDespesaGrupo(Integer exercicio, Integer unidadeGestora)
			throws Exception {
		List<OrcamentoDespesaGrupoDespesa> lista = new ArrayList<>();
		open(exercicio);
		String sql = "SELECT d.CODIGO,u.Desc_UnidadeGestora , ";
		sql = sql + " SUBSTRING(d.CODIGO, 1, 1) AS categoria_economica ,  ";
		sql = sql + " SUBSTRING(d.CODIGO, 1, 2) AS natureza,  ";
		sql = sql + " SUBSTRING(d.CODIGO, 1, 4) AS modalidade,  ";
		sql = sql + " SUBSTRING(d.CODIGO, 1, 6) AS elemento,  ";
		sql = sql + " SUBSTRING(d.CODIGO, 1, 8) AS sub_elemento,  ";
		sql = sql + " SUM(d.DESPESA_FIXADA) as valor_orcado   ";
		sql = sql + " FROM DESPESA d, UNIDADEGESTORA u  ";
		sql = sql + " WHERE d.Cod_UnidadeGestora = ?";
		sql = sql + " AND  d.Cod_UnidadeGestora = u.Cod_UnidadeGestora";
		sql = sql + " GROUP BY d.CODIGO ,u.Desc_UnidadeGestora  ";
		sql = sql + " ORDER BY CODIGO  ";

		stmt = con.prepareStatement(sql);
		stmt.setInt(1, unidadeGestora);
		rs = stmt.executeQuery();
		Double valorTotalCalculado = 0.;
		OrcamentoDespesaGrupoDespesa odgd = null;

		while (rs.next()) {
			// instanciando objetos
			odgd = new OrcamentoDespesaGrupoDespesa();

			Categoria categoria = new Categoria();
			UnidadeGestora unidade = new UnidadeGestora();
			Natureza natureza = new Natureza();
			Modalidade modalidade = new Modalidade();
			Elemento elemento = new Elemento();
			SubElemento subElemento = new SubElemento();

			// passando valores pro objeto
			categoria.setCodigo(rs.getString("categoria_economica").toUpperCase());
			unidade.setCodUnidadeGestora(unidadeGestora);
			unidade.setDescricaoUnidade(rs.getString("Desc_UnidadeGestora").toUpperCase());
			natureza.setCodigo(rs.getString("natureza").toUpperCase());
			modalidade.setCodigo(rs.getString("modalidade").toUpperCase());
			elemento.setCodigo(rs.getString("elemento").toUpperCase());
			subElemento.setCodigo(rs.getString("sub_elemento").toUpperCase());

			odgd.setExercicioOrcamento(exercicio);
			odgd.setCodigo(rs.getString("CODIGO").toUpperCase());
			odgd.setUnidadeGestora(unidade);
			odgd.setCategoria(categoria);
			odgd.setNatureza(natureza);
			odgd.setModalidade(modalidade);
			odgd.setElemento(elemento);
			odgd.setSubElemento(subElemento);
			odgd.setValorOrcado(ControleAdicionarMascara.formataDataReal(rs.getString("valor_orcado")));

			// CALCULO VALOR TOTAL
			valorTotalCalculado += rs.getDouble("valor_orcado");
			lista.add(odgd);

		}
		if (odgd != null) {
			odgd.setValorTotalOrcado(ControleAdicionarMascara.formataDataReal(valorTotalCalculado.toString()));
		}
		close();
		return lista;
	}

	public void verificarCategoria(Integer exercicio, OrcamentoDespesaGrupoDespesa orcamento) throws Exception {
		DaoCategoria dc = new DaoCategoria();
		orcamento.setCategoria(dc.findByCode(exercicio, orcamento.getCategoria().getCodigo()));
	}

	public void verificarNatureza(Integer exercicio, OrcamentoDespesaGrupoDespesa orcamento) throws Exception {
		DaoNatureza dn = new DaoNatureza();
		orcamento.setNatureza(dn.findByCode(exercicio, orcamento.getNatureza().getCodigo()));
	}

	public void verificarModalidade(Integer exercicio, OrcamentoDespesaGrupoDespesa orcamento) throws Exception {
		DaoModalidade dm = new DaoModalidade();
		orcamento.setModalidade(dm.findByCode(exercicio, orcamento.getModalidade().getCodigo()));
	}

	public void verificarElemento(Integer exercicio, OrcamentoDespesaGrupoDespesa orcamento) throws Exception {
		DaoElemento de = new DaoElemento();
		orcamento.setElemento(de.findByCode(exercicio, orcamento.getElemento().getCodigo()));
	}

	public void verificarSubElemento(Integer exercicio, OrcamentoDespesaGrupoDespesa orcamento) throws Exception {
		DaoSubElemento dse = new DaoSubElemento();
		orcamento.setSubElemento(dse.findByCode(exercicio, orcamento.getSubElemento().getCodigo()));
	}

	public OrcamentoDespesaGrupoDespesa verificarValorOrcadoGrupo(Integer nivel, OrcamentoDespesaGrupoDespesa orcamento)
			throws Exception {
		open(orcamento.getExercicioOrcamento());

		String comparativo = "";
		if (nivel == 1) {
			if (orcamento.getCategoria() == null) {
				return orcamento;
			}
			comparativo = ControleAdicionarMascara.retirarPontos(orcamento.getCategoria().getCodigo()).substring(0, 1)
					+ "%";
		} else if (nivel == 2) {
			if (orcamento.getNatureza() == null) {
				return orcamento;
			}
			comparativo = ControleAdicionarMascara.retirarPontos(orcamento.getNatureza().getCodigo()).substring(0, 2)
					+ "%";
		} else if (nivel == 3) {
			if (orcamento.getModalidade() == null) {
				return orcamento;
			}
			comparativo = ControleAdicionarMascara.retirarPontos(orcamento.getModalidade().getCodigo()).substring(0, 4)
					+ "%";
		} else if (nivel == 4) {
			if (orcamento.getElemento() == null) {
				return orcamento;
			}
			comparativo = ControleAdicionarMascara.retirarPontos(orcamento.getElemento().getCodigo()).substring(0, 6)
					+ "%";
		}

		String sql = "SELECT d.codigo, dc.DESCRICAO, SUM(d.DESPESA_FIXADA) as valor_Grupo  ";
		sql = sql + " FROM DESPESA d, DESPECOD dc";
		sql = sql + " WHERE d.Cod_UnidadeGestora = ?";
		sql = sql + " AND d.CODIGO like ? ";
		sql = sql + " AND d.CODIGO = dc.CODIGO";
		sql = sql + " GROUP BY d.codigo, dc.DESCRICAO";
		sql = sql + " ORDER BY d.CODIGO  ";

		stmt = con.prepareStatement(sql);

		stmt.setInt(1, orcamento.getUnidadeGestora().getCodUnidadeGestora());
		stmt.setString(2, comparativo);

		rs = stmt.executeQuery();
		Double valorCalculado = 0.;
		while (rs.next()) {
			valorCalculado += rs.getDouble("valor_Grupo");
		}

		orcamento.setValorOrcadoGrupo(ControleAdicionarMascara.formataDataReal(valorCalculado.toString()));
		close();
		return orcamento;
	}

}
