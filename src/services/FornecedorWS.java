package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import persistence.DaoFornecedor;

//CAMINHO
//http://localhost:8089/prjPortalContabilidade/webservice/fornecedor/findAll

@Path("/fornecedor")
public class FornecedorWS {

	// buscando todos os fornecedores
	@GET
	@Path("/findAll/{exercicio}")
	@Produces("application/json")
	public String listarTodos(@PathParam("exercicio") String ano) {
		try {
			Integer exercicio = new Integer(ano);
			return new Gson().toJson(new DaoFornecedor().findAll(exercicio));
		} catch (Exception e) {
			return "Error " + e.getMessage();
		}
	}

	// buscando pelo código do fornecedores
	@GET
	@Path("/findByCode/{exercicio}/{unidadeGestora}/{codigo}")
	@Produces("application/json")
	public String listarPorCodigo(@PathParam("exercicio") String ano,@PathParam("unidadeGestora") String unidadeGestora, @PathParam("codigo") String codigo) {
		Integer cod = new Integer(codigo);
		Integer unidade = new Integer(unidadeGestora);
		Integer exercicio = new Integer(ano);
		try {
			return new Gson().toJson(new DaoFornecedor().findByCode(exercicio,unidade, cod));
		} catch (Exception e) {
			return "Error " + e.getMessage();
		}
	}

	// buscando pelo codigo Unidade Gestora do fornecedores
	@GET
	@Path("/findByCodeUnidade/{exercicio}/{codigo}")
	@Produces("application/json")
	public String listarPorUnidadeGestora(@PathParam("exercicio") String ano,@PathParam("codigo") String codigo) {
		Integer cod = new Integer(codigo);
		Integer exercicio = new Integer(ano);
		try {
			return new Gson().toJson(new DaoFornecedor().findByCodeUnidadeGestora(exercicio, cod));
		} catch (Exception e) {
			return "Error " + e.getMessage();
		}
	}
}
