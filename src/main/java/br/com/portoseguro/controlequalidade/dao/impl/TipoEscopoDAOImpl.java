package br.com.portoseguro.controlequalidade.dao.impl;

import javax.ejb.Stateless;

import br.com.portoseguro.controlequalidade.dao.TipoEscopoDAO;
import br.com.portoseguro.controlequalidade.entity.TipoEscopo;

@Stateless
public class TipoEscopoDAOImpl extends GenericDAO<TipoEscopo, Long> implements TipoEscopoDAO {

	private static final long serialVersionUID = 4775472854946171175L;

	public TipoEscopoDAOImpl() {
		super(TipoEscopo.class);
	}
	
}
