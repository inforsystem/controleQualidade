package br.com.portoseguro.controlequalidade.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.portoseguro.controlequalidade.dao.TipoProcessoDAO;
import br.com.portoseguro.controlequalidade.entity.TipoProcesso;
import br.com.portoseguro.controlequalidade.exception.DAOException;

@Path("processo")
@RequestScoped
public class TipoProcessoService {

	@Inject
	private TipoProcessoDAO tipoProcessoDAO;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar() {
		List<TipoProcesso> processos = null;
		try {
			processos = this.tipoProcessoDAO.listAll();
		}catch(DAOException ex) {
			ex.printStackTrace();
			return Response.serverError().entity(ex.getMessage()).build();
		}
		return Response.ok(processos).build();
	}
	
}
