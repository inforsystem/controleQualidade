package br.com.portoseguro.controlequalidade.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.portoseguro.controlequalidade.dao.EquipeDAO;
import br.com.portoseguro.controlequalidade.entity.Equipe;
import br.com.portoseguro.controlequalidade.exception.DAOException;

@Path("equipe")
@RequestScoped
public class EquipeService {
	
	@Inject
	private EquipeDAO equipeDAO;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar() {
		List<Equipe> equipes = null;
		try {
			equipes = this.equipeDAO.listAll();
		}catch(DAOException ex) {
			ex.printStackTrace();
			return Response.serverError().entity(ex.getMessage()).build();
		}
		return Response.ok(equipes).build();
	}

}
