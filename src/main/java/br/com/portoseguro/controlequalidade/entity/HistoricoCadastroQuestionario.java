package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="historico_cadastro_questionario")
public class HistoricoCadastroQuestionario implements Serializable {

	private static final long serialVersionUID = 1698932231478336308L;
	
	@Id
	@Column(name="id_historico")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="desc_historico")
	private String descricaoHistorico;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_cadastro")
	private Date dataCadastro;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id_questionario")
	private Questionario questionario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoHistorico() {
		return descricaoHistorico;
	}

	public void setDescricaoHistorico(String descricaoHistorico) {
		this.descricaoHistorico = descricaoHistorico;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Questionario getQuestionario() {
		return questionario;
	}

	public void setQuestionario(Questionario questionario) {
		this.questionario = questionario;
	}
	
}
