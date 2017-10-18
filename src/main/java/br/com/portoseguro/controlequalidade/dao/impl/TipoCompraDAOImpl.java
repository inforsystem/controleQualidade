package br.com.portoseguro.controlequalidade.dao.impl;

import javax.ejb.Stateless;

import br.com.portoseguro.controlequalidade.dao.TipoCompraDAO;
import br.com.portoseguro.controlequalidade.entity.TipoCompra;

@Stateless
public class TipoCompraDAOImpl extends GenericDAO<TipoCompra, Long> implements TipoCompraDAO {

	private static final long serialVersionUID = 1583949914252883861L;

	public TipoCompraDAOImpl() {
		super(TipoCompra.class);
	}
	
}
