package br.com.portoseguro.controlequalidade.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import br.com.portoseguro.controlequalidade.dao.LoginDAO;
import br.com.portoseguro.controlequalidade.entity.Login;
import br.com.portoseguro.controlequalidade.exception.DAOException;

@Stateless
public class LoginDAOImpl extends GenericDAO<Login, Long> implements LoginDAO {

	private static final long serialVersionUID = 3602536979279264646L;

	public LoginDAOImpl() {
		super(Login.class);
	}

	@Override
	public Login buscarPorSenha(String senha) throws DAOException {
		Login login = null;
		try {
			TypedQuery<Login> query = this.manager.createNamedQuery(Login.BUSCAR_POR_SENHA, Login.class);
			query.setParameter("pswd", senha);
			login = query.getSingleResult();
		}catch (Exception ex) {
			throw new DAOException(ex);
		}
		return login;
	}
	
}
