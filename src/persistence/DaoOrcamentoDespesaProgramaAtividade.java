package persistence;

import java.util.ArrayList;
import java.util.List;

import control.ControleAdicionarMascara;
import dto.OrcamentoDespesaProgramaAtividade;
import entity.Atividade;
import entity.Programa;
import entity.UnidadeGestora;

public class DaoOrcamentoDespesaProgramaAtividade extends Dao{

	
	public List<OrcamentoDespesaProgramaAtividade> relatorioDespesaProgramaAtividade(Integer exercicio, Integer unidadeGestora) throws Exception{
		open(exercicio);
		List<OrcamentoDespesaProgramaAtividade> lista = new ArrayList<OrcamentoDespesaProgramaAtividade>();
		OrcamentoDespesaProgramaAtividade odpa = null;
		
		String sql =  "SELECT d.PROGRAMA as codigo_programa, p.DESCRICAO as descricao_programa,";
        sql = sql + " d.PROJETO_ATIVIDADE codigo_atividade, a.DESCRICAO descricao_atividade, sum(d.DESPESA_FIXADA) valor_orcado";
		sql = sql + " FROM despesa d, PROGRAMA p, PROJATIV a	 ";
		sql = sql + " WHERE d.PROGRAMA = p.CODIGO";
		sql = sql + " AND d.PROJETO_ATIVIDADE = a.CODIGO";
		sql = sql + " AND d.Cod_UnidadeGestora =  ? ";
		sql = sql + " GROUP BY d.PROGRAMA,p.DESCRICAO, 	d.PROJETO_ATIVIDADE, a.DESCRICAO";
		sql = sql + " ORDER BY d.PROGRAMA, d.PROJETO_ATIVIDADE";
		
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, unidadeGestora);
		rs = stmt.executeQuery();
		while(rs.next()) {
			
			odpa = new OrcamentoDespesaProgramaAtividade();
			odpa.setUnidadeGestora(new DaoUnidadeGestora().findByCode(exercicio, unidadeGestora));
			Programa programa = new Programa();
			programa.setCodigo(rs.getString("codigo_programa"));
			programa.setDescricao(rs.getString("descricao_programa"));
			Atividade atividade = new Atividade();
			atividade.setCodigo(rs.getString("codigo_atividade"));
			atividade.setDescricao(rs.getString("descricao_atividade"));
			
			
			odpa.setExercicioOrcamento(exercicio);
			odpa.setAtividade(atividade);
			odpa.setPrograma(programa);
			odpa.setValorOrcado(ControleAdicionarMascara.formataDataReal(rs.getString("valor_orcado")));
			lista.add(odpa);
		}
		
		
		close();
		return lista;
		
	}
	
	
}
