package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Fornecedor;

public class DaoFornecedor extends Dao {
	// busca pelo codigo do fornecedor
	public Fornecedor findByCode(Integer exercicio, Integer unidade, Integer cod) throws Exception {
		open(exercicio);
		Fornecedor fornecedor = null;
		stmt = con.prepareStatement("SELECT * FROM FORCAD WHERE Cod_UnidadeGestora = ?  AND CODIGO = ?");
		stmt.setInt(1, unidade);
		stmt.setInt(2, cod);
		rs = stmt.executeQuery();
		if (rs.next()) {
			fornecedor = new Fornecedor();
			fornecedor.setCodigo(rs.getInt("CODIGO"));
			fornecedor.setUnidadeGestora(rs.getInt("Cod_UnidadeGestora"));
			fornecedor.setCpf(rs.getString("CPF"));
			fornecedor.setNome(rs.getString("NOME"));
			fornecedor.setCnpj(rs.getString("CGC"));

		}
		close();
		return fornecedor;
	}

	// retorna todos os fornecedores cadastrado no sistema
	public List<Fornecedor> findAll(Integer exercicio) throws Exception {
		open(exercicio);
		List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
		stmt = con.prepareStatement("SELECT * FROM FORCAD");
		rs = stmt.executeQuery();
		while (rs.next()) {
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setCodigo(rs.getInt("CODIGO"));
			fornecedor.setUnidadeGestora(rs.getInt("Cod_UnidadeGestora"));
			fornecedor.setCpf(rs.getString("CPF"));
			fornecedor.setNome(rs.getString("NOME"));
			fornecedor.setCnpj(rs.getString("CGC"));
			listaFornecedor.add(fornecedor);
		}
		close();
		return listaFornecedor;
	}

	// retorna todos os setores cadastrado com a unidade gestora especifica
	public List<Fornecedor> findByCodeUnidadeGestora(Integer exercicio,Integer cod) throws Exception {
		open(exercicio);
		List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
		stmt = con.prepareStatement("SELECT * FROM FORCAD WHERE Cod_UnidadeGestora = ?");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		while (rs.next()) {
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setCodigo(rs.getInt("CODIGO"));
			fornecedor.setUnidadeGestora(rs.getInt("Cod_UnidadeGestora"));
			fornecedor.setCpf(rs.getString("CPF"));
			fornecedor.setNome(rs.getString("NOME"));
			fornecedor.setCnpj(rs.getString("CGC"));
			listaFornecedor.add(fornecedor);
		}
		close();
		return listaFornecedor;
	}

}
