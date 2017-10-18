package br.com.portoseguro.controlequalidade.dao;

import br.com.portoseguro.controlequalidade.entity.Login;
import br.com.portoseguro.controlequalidade.exception.DAOException;

public interface LoginDAO extends DAO<Login, Long> {

	public abstract Login buscarPorSenha(String senha) throws DAOException;
	
}
