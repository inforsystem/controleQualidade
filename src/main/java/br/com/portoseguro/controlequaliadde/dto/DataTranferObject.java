package br.com.portoseguro.controlequaliadde.dto;

import java.io.Serializable;

public interface DataTranferObject<T, DTO> extends Serializable {

	public abstract T convertoToEntity();
	
	public abstract DTO consumeEntity(T entity);
	
}
