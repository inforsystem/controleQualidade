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
@Table(name="cadastrar_resposta")
public class Resposta implements Serializable {

	private static final long serialVersionUID = 1762438363598851393L;
	
	@Id
	@Column(name="id_resposta")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="desc_resposta")
	private String descricao;
	
	@OneToOne(mappedBy="resposta")
	private RespostaQuestionario respostaQuestionario;

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

	public RespostaQuestionario getRespostaQuestionario() {
		return respostaQuestionario;
	}

	public void setRespostaQuestionario(RespostaQuestionario respostaQuestionario) {
		this.respostaQuestionario = respostaQuestionario;
	}

	@Override
	public String toString() {
		return "Resposta [id=" + id + ", descricao=" + descricao + ", respostaQuestionario=" + respostaQuestionario
				+ "]";
	}

}
