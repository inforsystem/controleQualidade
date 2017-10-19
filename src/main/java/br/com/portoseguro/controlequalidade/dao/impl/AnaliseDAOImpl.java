package br.com.portoseguro.controlequalidade.dao.impl;

import javax.ejb.Stateless;

import br.com.portoseguro.controlequalidade.dao.AnaliseDAO;
import br.com.portoseguro.controlequalidade.entity.Analise;

@Stateless
public class AnaliseDAOImpl extends GenericDAO<Analise, Long> implements AnaliseDAO {

	private static final long serialVersionUID = -9019021901129626864L;

	public AnaliseDAOImpl() {
		super(Analise.class);
	}
	
}
