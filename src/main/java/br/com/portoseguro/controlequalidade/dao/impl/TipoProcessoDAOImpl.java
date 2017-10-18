package br.com.portoseguro.controlequalidade.dao.impl;

import javax.ejb.Stateless;

import br.com.portoseguro.controlequalidade.dao.TipoProcessoDAO;
import br.com.portoseguro.controlequalidade.entity.TipoProcesso;

@Stateless
public class TipoProcessoDAOImpl extends GenericDAO<TipoProcesso, Long> implements TipoProcessoDAO {

	private static final long serialVersionUID = -8590557198614535139L;

	public TipoProcessoDAOImpl() {
		super(TipoProcesso.class);
	}
		
}
