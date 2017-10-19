package br.com.portoseguro.controlequaliadde.dto;

import br.com.portoseguro.controlequalidade.entity.TipoProcesso;

public class TipoProcessoDTO implements DataTranferObject<TipoProcesso, TipoProcessoDTO> {

	private static final long serialVersionUID = -7181780935107092939L;

	private Long id;
	private String descricao;
	
	public TipoProcessoDTO() {
	}
	
	public TipoProcessoDTO(Long id) {
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
		return "TipoProcessoDTO [id=" + id + ", descricao=" + descricao + "]";
	}

	@Override
	public TipoProcesso convertoToEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoProcessoDTO consumeEntity(TipoProcesso entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
