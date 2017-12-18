package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import entity.Empenho;
import persistence.DaoEmpenho;

//CAMINHO
//http://localhost:8089/prjPortalContabilidade/webservice/empenho/lrfDespesaDetalhada

@Path("/empenho")
public class EmepnhoWS {

	// buscando pelo unidade gestora e pela observação
	@GET
	@Path("/lrfDespesaDetalhada/{exercicio}/{unidadeGestora}/{observacao}")
	@Produces("application/json")
	public String listarPorCodigo(@PathParam("exercicio") String ano,
			@PathParam("unidadeGestora") String unidadeGestora, @PathParam("observacao") String observacao) {

		Integer unidade = new Integer(unidadeGestora);
		Integer exercicio = new Integer(ano);
		if (observacao.equalsIgnoreCase("+")) {
			observacao = " ";
		}
		System.out.println("executando");

		try {
			DaoEmpenho d = new DaoEmpenho();
			List<Empenho> listaEmpenhos = d.lrfDespesaDetalhada(exercicio, unidade, observacao);
			for (Empenho empenho : listaEmpenhos) {

				d.valorLiquidoEmpenho(exercicio, empenho);

				// System.out.println(empenho);
			}
			System.out.println("executado");
			return new Gson().toJson(listaEmpenhos);

		} catch (Exception e) {
			return "Error " + e.getMessage();
		}
	}

}
