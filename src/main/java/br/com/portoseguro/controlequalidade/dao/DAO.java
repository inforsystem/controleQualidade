package br.com.portoseguro.controlequalidade.dao;

import java.io.Serializable;
import java.util.List;

import br.com.portoseguro.controlequalidade.exception.DAOException;

public interface DAO<T, PK> extends Serializable {

	public static final String UNIT_NAME = "controle-qualidade";

	public abstract void save(T t) throws DAOException;

	public abstract void delete(T t) throws DAOException;

	public abstract void update(T t) throws DAOException;

	public abstract T findById(PK pk) throws DAOException;

	public abstract List<T>listAll() throws DAOException;

	public abstract List<T> listNamedQuery(String query) throws DAOException;
	
}
