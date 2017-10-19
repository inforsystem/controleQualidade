package br.com.portoseguro.controlequalidade.dao;

import java.util.List;

import br.com.portoseguro.controlequalidade.entity.Usuario;
import br.com.portoseguro.controlequalidade.exception.DAOException;

public interface UsuarioDAO extends DAO<Usuario, Long>{

	public abstract List<Usuario> buscarPorPerfil(Long idPerfil) throws DAOException;
	
}
