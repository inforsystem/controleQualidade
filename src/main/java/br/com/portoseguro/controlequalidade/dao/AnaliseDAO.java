package br.com.portoseguro.controlequalidade.dao;

import java.util.List;

import br.com.portoseguro.controlequaliadde.dto.DadosExemploDTO;
import br.com.portoseguro.controlequalidade.entity.Analise;

public interface AnaliseDAO extends DAO<Analise, Long> {
	
	public abstract List<DadosExemploDTO> dados();
	
}
