package br.com.portoseguro.controlequalidade.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.portoseguro.controlequalidade.dao.UsuarioDAO;
import br.com.portoseguro.controlequalidade.entity.Usuario;
import br.com.portoseguro.controlequalidade.exception.DAOException;

@Path("usuario")
@RequestScoped
public class UsuarioService {
	
	@Inject
	private UsuarioDAO usuarioDAO;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response lista() {
		List<Usuario> usuarios = null;
		try {
			usuarios = this.usuarioDAO.listAll();
		}catch(DAOException ex) {
			ex.printStackTrace();
			return Response.serverError().entity(ex.getMessage()).build();
		}
		return Response.ok(usuarios).build();
	}
	
	@GET
	@Path("buscar/perfil/{perfil}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorPerfil(@PathParam("perfil") Long idPerfil) {
		List<Usuario> usuarios = null;
		try {
			usuarios = this.usuarioDAO.buscarPorPerfil(idPerfil);
		}catch(DAOException ex) {
			ex.printStackTrace();
			return Response.serverError().entity(ex.getMessage()).build();
		}
		return Response.ok(usuarios).build();
	}
	
	
}
