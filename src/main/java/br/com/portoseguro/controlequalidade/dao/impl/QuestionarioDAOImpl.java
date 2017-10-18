package br.com.portoseguro.controlequalidade.dao.impl;

import javax.ejb.Stateless;

import br.com.portoseguro.controlequalidade.dao.QuestionarioDAO;
import br.com.portoseguro.controlequalidade.entity.Questionario;

@Stateless
public class QuestionarioDAOImpl extends GenericDAO<Questionario, Long> implements QuestionarioDAO {

	private static final long serialVersionUID = 4064295754671446574L;

	public QuestionarioDAOImpl() {
		super(Questionario.class);
	}
	
}
