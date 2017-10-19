package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cadastrar_tipo_processo")
public class TipoProcesso implements Serializable {

	private static final long serialVersionUID = 5470607915511064850L;
	
	@Id
	@Column(name="id_processo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="desc_processo")
	private String descricao;
	
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
		return "TipoProcesso [id=" + id + ", descricao=" + descricao + "]";
	}

}
