package br.com.portoseguro.controlequalidade.service;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.portoseguro.controlequalidade.entidade.Usuario;

@Path("usuario")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioService {

	@GET
	public Response lista() {
		List<Usuario> usuarios = Arrays.asList(
				new Usuario(1, "Gardim 1", true),
				new Usuario(2, "Gardim 2", true),
				new Usuario(3, "Gardim 3", true),
				new Usuario(4, "Gardim 4", true),
				new Usuario(5, "Gardim 5", true)
		);
		return Response.ok(usuarios).build();
	}
	
	
}
