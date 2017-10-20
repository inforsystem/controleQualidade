package br.com.portoseguro.controlequalidade.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.portoseguro.controlequaliadde.dto.DadosExemploDTO;
import br.com.portoseguro.controlequalidade.dao.AnaliseDAO;

@Path("grafico")
@RequestScoped
public class GraficoService {
	
	@Inject
	private AnaliseDAO analiseDAO;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarDados() {
		List<DadosExemploDTO> dtos = analiseDAO.dados();
		return Response.ok(dtos).build();
	}
	
}
