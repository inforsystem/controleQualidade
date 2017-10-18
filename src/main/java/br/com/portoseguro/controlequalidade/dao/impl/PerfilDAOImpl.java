package br.com.portoseguro.controlequalidade.dao.impl;

import javax.ejb.Stateless;

import br.com.portoseguro.controlequalidade.dao.PerfilDAO;
import br.com.portoseguro.controlequalidade.entity.Perfil;

@Stateless
public class PerfilDAOImpl extends GenericDAO<Perfil, Long> implements PerfilDAO {

	private static final long serialVersionUID = 1739554987799494425L;

	public PerfilDAOImpl() {
		super(Perfil.class);
	}
	
}
