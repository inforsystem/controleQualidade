package br.com.portoseguro.controlequalidade.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import br.com.portoseguro.controlequaliadde.dto.DadosExemploDTO;
import br.com.portoseguro.controlequalidade.dao.AnaliseDAO;
import br.com.portoseguro.controlequalidade.entity.Analise;

@Stateless
public class AnaliseDAOImpl extends GenericDAO<Analise, Long> implements AnaliseDAO {

	private static final long serialVersionUID = -9019021901129626864L;

	public AnaliseDAOImpl() {
		super(Analise.class);
	}

	@Override
	public List<DadosExemploDTO> dados() {
		StringBuilder sql = new StringBuilder();
		sql.append("select count(a.mes_referencia) as 'QtdeMes', a.mes_referencia as 'Mes', ");
		sql.append("count(a.motivocq) as 'QtdeMotivo', ");
		sql.append("count(a.local_processo) as 'QtdeProcesso' from analise a ");
		sql.append("group by a.motivocq, a.local_processo");
		
		@SuppressWarnings("unchecked")
		List<Object[]> results = this.manager.createNativeQuery(sql.toString()).getResultList();
		
		List<DadosExemploDTO> dtos = new ArrayList<>();
		
		results.stream().forEach((dado) -> {
	        dtos.add(new DadosExemploDTO(new Integer(dado[0].toString()), new Integer(dado[1].toString()), new Integer(dado[2].toString()), new Integer(dado[3].toString())));
		});
		
		return dtos;
	}
	
}
