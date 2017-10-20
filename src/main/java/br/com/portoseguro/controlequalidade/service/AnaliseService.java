package br.com.portoseguro.controlequalidade.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.portoseguro.controlequaliadde.dto.AnaliseDTO;
import br.com.portoseguro.controlequalidade.dao.AnaliseDAO;
import br.com.portoseguro.controlequalidade.dao.EquipeDAO;
import br.com.portoseguro.controlequalidade.dao.TipoProcessoDAO;
import br.com.portoseguro.controlequalidade.entity.Analise;
import br.com.portoseguro.controlequalidade.entity.Equipe;
import br.com.portoseguro.controlequalidade.entity.TipoProcesso;
import br.com.portoseguro.controlequalidade.exception.DAOException;

@Path("analise")
@RequestScoped
public class AnaliseService {
	
	@Inject
	private AnaliseDAO analiseDAO;
	
	@Inject
	private EquipeDAO equipeDAO;
	
	@Inject
	private TipoProcessoDAO tipoProcessoDAO;
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorId(@PathParam("id") Long id) {
		Analise analise = null;
		try {
			analise = this.analiseDAO.findById(id);
		}catch(DAOException ex) {
			ex.printStackTrace();
			return Response.serverError().entity(ex.getMessage()).build();
		}
		return Response.ok(analise).build();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvar(AnaliseDTO analise) {
		
		Analise analiseBase = analise.convertoToEntity();
		
		System.out.println(analiseBase);
		
		try {
			Equipe equipe = equipeDAO.findById(analise.getEquipe());
			TipoProcesso tipoProcesso = tipoProcessoDAO.findById(analise.getTipoProcesso());
			
			analiseBase.setEquipe(equipe);
			analiseBase.setTipoProcesso(tipoProcesso);
			
			analiseDAO.save(analiseBase);
		}catch(DAOException ex) {
			ex.printStackTrace();
			return Response.serverError().entity(ex.getMessage()).build();
		}
		return Response.ok(analise).build();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response alterar(Analise analise) {
		try {
			analiseDAO.save(analise);
		}catch(DAOException ex) {
			return Response.serverError().entity(ex.getMessage()).build();
		}
		return Response.ok(analise).build();
	}

}
