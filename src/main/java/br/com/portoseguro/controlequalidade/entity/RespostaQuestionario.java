package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="resposta_questionario")
public class RespostaQuestionario implements Serializable {

	private static final long serialVersionUID = 2849471390735145482L;
	
	@Id
	@Column(name="id_resposta_questionario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch=FetchType.EAGER)
	private Resposta resposta;
	
	@ManyToOne
	@JoinColumn(name="id_questionario")
	private Questionario questionario;
	
	@ManyToOne
	@JoinColumn(name="id_analise")
	private Analise analise;
	
	@Column(name="vlr_score")
	private BigDecimal valorScore;

	public Resposta getResposta() {
		return resposta;
	}

	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}

	public Questionario getQuestionario() {
		return questionario;
	}

	public void setQuestionario(Questionario questionario) {
		this.questionario = questionario;
	}

	public Analise getAnalise() {
		return analise;
	}

	public void setAnalise(Analise analise) {
		this.analise = analise;
	}

	public BigDecimal getValorScore() {
		return valorScore;
	}

	public void setValorScore(BigDecimal valorScore) {
		this.valorScore = valorScore;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RespostaQuestionario [id=" + id + ", resposta=" + resposta + ", questionario=" + questionario
				+ ", analise=" + analise + ", valorScore=" + valorScore + "]";
	}
	
}
