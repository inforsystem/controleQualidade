package br.com.portoseguro.controlequalidade.utils.impl;

import java.util.Base64;

import javax.enterprise.context.Dependent;

import br.com.portoseguro.controlequalidade.utils.EncriptUtils;

@Dependent // TODO Tirar Base64 e criptografar corretamente
public class EncriptUtilsImpl implements EncriptUtils {

	private static final long serialVersionUID = 2538308940200686057L;

	@Override
	public String encode(final String texto) {
		String txt = Base64.getEncoder().encodeToString(texto.getBytes());
		return txt;
	}

	@Override
	public String decode(final String texto) {
		String txt = new String(Base64.getDecoder().decode(texto.getBytes()));
		return txt;
	}

}
