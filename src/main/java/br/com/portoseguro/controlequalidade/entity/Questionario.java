package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cadastrar_questionario")
public class Questionario implements Serializable {

	private static final long serialVersionUID = 3588023302040186686L;

	@Id
	@Column(name="id_questionario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="numero_pergunta")
	private Integer numeroPergunta;
	
	@Column(name="desc_questionario")
	private String descricao;
	
	@Column(name="vlr_score")
	private Integer valorScore;
	
	@Column(name="status_questionario")
	private Boolean ativo;
	
	@ManyToOne
	@JoinColumn(name="id_processo")
	private TipoProcesso tipoProcesso;
	
	@ManyToOne
	@JoinColumn(name="id_compra")
	private TipoCompra tipoCompra;
	
	@ManyToOne
	@JoinColumn(name="id_escopo")
	private TipoEscopo tipoEscopo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumeroPergunta() {
		return numeroPergunta;
	}

	public void setNumeroPergunta(Integer numeroPergunta) {
		this.numeroPergunta = numeroPergunta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getValorScore() {
		return valorScore;
	}

	public void setValorScore(Integer valorScore) {
		this.valorScore = valorScore;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public TipoProcesso getTipoProcesso() {
		return tipoProcesso;
	}

	public void setTipoProcesso(TipoProcesso tipoProcesso) {
		this.tipoProcesso = tipoProcesso;
	}

	public TipoCompra getTipoCompra() {
		return tipoCompra;
	}

	public void setTipoCompra(TipoCompra tipoCompra) {
		this.tipoCompra = tipoCompra;
	}

	public TipoEscopo getTipoEscopo() {
		return tipoEscopo;
	}

	public void setTipoEscopo(TipoEscopo tipoEscopo) {
		this.tipoEscopo = tipoEscopo;
	}

	@Override
	public String toString() {
		return "Questionario [id=" + id + ", numeroPergunta=" + numeroPergunta + ", descricao=" + descricao
				+ ", valorScore=" + valorScore + ", ativo=" + ativo + ", tipoProcesso=" + tipoProcesso + ", tipoCompra="
				+ tipoCompra + ", tipoEscopo=" + tipoEscopo + "]";
	}
	
}
