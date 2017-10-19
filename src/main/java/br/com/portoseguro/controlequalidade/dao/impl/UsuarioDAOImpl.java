package br.com.portoseguro.controlequalidade.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import br.com.portoseguro.controlequalidade.dao.UsuarioDAO;
import br.com.portoseguro.controlequalidade.entity.Usuario;
import br.com.portoseguro.controlequalidade.exception.DAOException;

@Stateless
public class UsuarioDAOImpl extends GenericDAO<Usuario, Long> implements UsuarioDAO {

	private static final long serialVersionUID = -2277816635171522163L;

	public UsuarioDAOImpl() {
		super(Usuario.class);
	}

	@Override
	public List<Usuario> buscarPorPerfil(Long idPerfil) throws DAOException {
		try {
			TypedQuery<Usuario> query = this.manager.createNamedQuery(Usuario.BUSCAR_POR_PERFIL, Usuario.class);
			query.setParameter("idPerfil", idPerfil);
			return query.getResultList();
		}catch(Exception ex) {
			throw new DAOException(ex);
		}
	}
	
}
