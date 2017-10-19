package br.com.portoseguro.controlequalidade.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class DAOException extends Exception {

	private static final long serialVersionUID = 31470021604931653L;

	public DAOException(String message) {
		super(message);
	}
	
	public DAOException(Throwable throwable) {
		super(throwable);
	}
	
	public DAOException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
}
