package br.com.portoseguro.controlequaliadde.dto;

import br.com.portoseguro.controlequalidade.entity.Equipe;

public class EquipeDTO implements DataTranferObject<Equipe, EquipeDTO> {

	private static final long serialVersionUID = 4073005631784560519L;
	
	private Long id;
	private String descricao;
	
	public EquipeDTO() {
	}
	
	public EquipeDTO(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "EquipeDTO [id=" + id + ", descricao=" + descricao + "]";
	}

	@Override
	public Equipe convertoToEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EquipeDTO consumeEntity(Equipe entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
