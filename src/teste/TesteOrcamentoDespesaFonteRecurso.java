package teste;

import java.util.List;

import entity.OrcamentoDespesaFonteRecurso;
import persistence.DaoOrcamentoDespesaFonteRecurso;

public class TesteOrcamentoDespesaFonteRecurso {

	public static void main(String[] args) {
		try {
			DaoOrcamentoDespesaFonteRecurso dao = new DaoOrcamentoDespesaFonteRecurso();
			System.out.println("abrino");
			List<OrcamentoDespesaFonteRecurso> lista = dao.findAll(2016, 0);
			for (OrcamentoDespesaFonteRecurso orcamento : lista) {
				System.out.println("Cod => " + orcamento.getFonte().getCodigo() + ", nome"
						+ orcamento.getFonte().getNome() + ", valor " + orcamento.getValorOrcado());
			}
			System.out.println("saiu");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
