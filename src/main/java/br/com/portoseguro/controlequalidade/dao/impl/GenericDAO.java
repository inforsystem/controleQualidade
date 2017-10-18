package br.com.portoseguro.controlequalidade.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.portoseguro.controlequalidade.dao.DAO;
import br.com.portoseguro.controlequalidade.exception.DAOException;

@Stateless
public abstract class GenericDAO<T, PK> implements DAO<T, PK> {

	private static final long serialVersionUID = -7089111962706670771L;
	
	@PersistenceContext(unitName=UNIT_NAME)
	protected EntityManager manager;
	
	private Class<T> clazz;
	
	public GenericDAO(final Class<T> clazz){
		this.clazz = clazz;
	}
	
	@Override
	public void save(T entity) throws DAOException {
		try {
			this.manager.persist(entity);
		}catch (Exception ex) {
			throw new DAOException(ex);
		}
	}
	
	@Override
	public void delete(T entity) throws DAOException {
		try {
			T t = manager.merge(entity);
			manager.remove(t);
		}catch(Exception ex) {
			throw new DAOException(ex);
		}
	}
	
	@Override
	public void update(T entity) throws DAOException {
		try {
			manager.merge(entity);
		}catch(Exception ex) {
			throw new DAOException(ex);
		}
	}
	
	@Override
	public List<T> listAll() throws DAOException {
		TypedQuery<T> query = manager.createQuery(("FROM " + this.clazz.getName()), this.clazz);
		return query.getResultList();
	}
	
	@Override
	public T findById(final PK pk) throws DAOException{
		try {
			return manager.find(this.clazz, pk);
		}catch(Exception ex) {
			throw new DAOException(ex);
		}
	}
	
	@Override
	public List<T> listNamedQuery(final String namedQuery) throws DAOException {
		try {
			TypedQuery<T> query = manager.createNamedQuery(namedQuery, this.clazz);
			return query.getResultList();
		}catch(Exception ex) {
			throw new DAOException(ex);
		}
	}

}
