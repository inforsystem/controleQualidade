package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cadastrar_tipo_compra")
public class TipoCompra implements Serializable {

	private static final long serialVersionUID = -1083261619268701219L;
	
	@Id
	@Column(name="id_compra")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="desc_compra")
	private String descricao;
	
	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(name="tipo_compra_processo", joinColumns=
     	{@JoinColumn(name="id_compra")}, inverseJoinColumns={@JoinColumn(name="id_processo")}) 
	private List<TipoProcesso> tiposProcesso; 

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

	public List<TipoProcesso> getTiposProcesso() {
		return tiposProcesso;
	}

	public void setTiposProcesso(List<TipoProcesso> tiposProcesso) {
		this.tiposProcesso = tiposProcesso;
	}

}
