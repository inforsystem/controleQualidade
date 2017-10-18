package br.com.portoseguro.controlequalidade.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.portoseguro.controlequaliadde.dto.LoginDTO;
import br.com.portoseguro.controlequalidade.dao.LoginDAO;
import br.com.portoseguro.controlequalidade.entity.Login;
import br.com.portoseguro.controlequalidade.exception.DAOException;
import br.com.portoseguro.controlequalidade.utils.EncriptUtils;

@Path("login")
@RequestScoped
public class LoginService {
	
	@Inject
	private EncriptUtils encriptUtils;
	
	@Inject
	private LoginDAO loginDAO;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(LoginDTO loginDTO) {
		
		try {
			
			String encode = encriptUtils.encode(loginDTO.getPassword());
			Login loginBase = loginDAO.buscarPorSenha(encode);
			
			if(loginBase == null) {
				return Response.serverError().status(Status.NOT_FOUND).build();
			}
			
			if(loginBase.getUsuario().getId().toString().equals(loginDTO.getUsername())) {
				return Response.ok(loginBase).build();
			}
			
		} catch (DAOException e) {
			return Response.serverError().entity(e.getMessage()).build();
		}
		
		return Response.serverError().build();
	}
	
}
