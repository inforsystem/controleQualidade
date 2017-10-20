package br.com.portoseguro.controlequalidade.dao.impl;

import javax.ejb.Stateless;

import br.com.portoseguro.controlequalidade.dao.UsuarioDAO;
import br.com.portoseguro.controlequalidade.entity.Usuario;

@Stateless
public class UsuarioDAOImpl extends GenericDAO<Usuario, Long> implements UsuarioDAO {

	private static final long serialVersionUID = -2277816635171522163L;

	public UsuarioDAOImpl() {
		super(Usuario.class);
	}

}
