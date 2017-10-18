package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cadastrar_equipe")
public class Equipe implements Serializable {

	private static final long serialVersionUID = -6573410052681521057L;

	@Id
	@Column(name="id_equipe")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="desc_equipe")
	private String descricao;
	
	@OneToOne(mappedBy="equipe")
	private Analise analise;
	
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

	public Analise getAnalise() {
		return analise;
	}

	public void setAnalise(Analise analise) {
		this.analise = analise;
	}

	@Override
	public String toString() {
		return "Equipe [id=" + id + ", descricao=" + descricao + ", analise=" + analise + "]";
	}

}
