package br.com.portoseguro.controlequalidade.utils;

import java.io.Serializable;

public interface EncriptUtils extends Serializable {

	public abstract String encode(String texto);
	
	public abstract String decode(String texto);
	
}
