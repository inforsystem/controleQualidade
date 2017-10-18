package br.com.portoseguro.controlequalidade.dao.impl;

import javax.ejb.Stateless;

import br.com.portoseguro.controlequalidade.dao.EquipeDAO;
import br.com.portoseguro.controlequalidade.entity.Equipe;

@Stateless
public class EquipeDAOImpl extends GenericDAO<Equipe, Long> implements EquipeDAO {

	private static final long serialVersionUID = -8077186564335051978L;

	public EquipeDAOImpl() {
		super(Equipe.class);
	}
	
}
