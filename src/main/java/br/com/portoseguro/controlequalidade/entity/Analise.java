package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="analise")
public class Analise implements Serializable {

	private static final long serialVersionUID = -1022140017702775446L;
	
	@Id
	@Column(name="id_analise")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="mes_referencia")
	private Date mesReferencia;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ano_referencia")
	private Date anoReferencia;

	@Temporal(TemporalType.DATE)
	@Column(name="data_analise")
	private Date dataAnalise;
	
	@Column(name="motivocq")
	private String motivoCQ;
	
	@Column(name="requisicao_compra")
	private String requisicaoCompra;
	
	@Column(name="pedido")
	private String pedido;
	
//	@Column(name="id_usuario_analise")
//	private Long idUsuarioAnalise; // TODO verificar relacionamento (Marcelo)
	
	@Column(name="desc_produto")
	private String descricaoProduto;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_solicitacao")
	private Date dataSolicitacao;
	
	@Column(name="local_processo")
	private String localProcesso;
	
	@Column(name="numero_demanda")
	private String numeroDemanda;  
	
	@Column(name="status_analise")
	private Boolean ativo;
	
	@Column(name="obs_analise")
	private String observacaoAnalise;
	
	@OneToOne
	@JoinColumn(name="id_processo")
	private TipoProcesso tipoProcesso;
	
	@OneToOne
	@JoinColumn(name="id_equipe")
	private Equipe equipe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(Date mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public Date getAnoReferencia() {
		return anoReferencia;
	}

	public void setAnoReferencia(Date anoReferencia) {
		this.anoReferencia = anoReferencia;
	}

	public Date getDataAnalise() {
		return dataAnalise;
	}

	public void setDataAnalise(Date dataAnalise) {
		this.dataAnalise = dataAnalise;
	}

	public String getMotivoCQ() {
		return motivoCQ;
	}

	public void setMotivoCQ(String motivoCQ) {
		this.motivoCQ = motivoCQ;
	}

	public String getRequisicaoCompra() {
		return requisicaoCompra;
	}

	public void setRequisicaoCompra(String requisicaoCompra) {
		this.requisicaoCompra = requisicaoCompra;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

//	public Long getIdUsuarioAnalise() {
//		return idUsuarioAnalise;
//	}
//
//	public void setIdUsuarioAnalise(Long idUsuarioAnalise) {
//		this.idUsuarioAnalise = idUsuarioAnalise;
//	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public String getLocalProcesso() {
		return localProcesso;
	}

	public void setLocalProcesso(String localProcesso) {
		this.localProcesso = localProcesso;
	}

	public String getNumeroDemanda() {
		return numeroDemanda;
	}

	public void setNumeroDemanda(String numeroDemanda) {
		this.numeroDemanda = numeroDemanda;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getObservacaoAnalise() {
		return observacaoAnalise;
	}

	public void setObservacaoAnalise(String observacaoAnalise) {
		this.observacaoAnalise = observacaoAnalise;
	}

	public TipoProcesso getTipoProcesso() {
		return tipoProcesso;
	}

	public void setTipoProcesso(TipoProcesso tipoProcesso) {
		this.tipoProcesso = tipoProcesso;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

//	@Override
//	public String toString() {
//		return "Analise [id=" + id + ", mesReferencia=" + mesReferencia + ", anoReferencia=" + anoReferencia
//				+ ", dataAnalise=" + dataAnalise + ", motivoCQ=" + motivoCQ + ", requisicaoCompra=" + requisicaoCompra
//				+ ", pedido=" + pedido + ", idUsuarioAnalise=" + idUsuarioAnalise + ", descricaoProduto="
//				+ descricaoProduto + ", dataSolicitacao=" + dataSolicitacao + ", localProcesso=" + localProcesso
//				+ ", numeroDemanda=" + numeroDemanda + ", ativo=" + ativo + ", observacaoAnalise=" + observacaoAnalise
//				+ ", tipoProcesso=" + tipoProcesso + ", equipe=" + equipe + "]";
//	}

	
}
