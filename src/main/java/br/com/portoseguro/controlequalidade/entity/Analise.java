package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@Column(name="mes_referencia")
	private Integer mesReferencia;
	
	@Column(name="ano_referencia")
	private Integer anoReferencia;

	@Temporal(TemporalType.DATE)
	@Column(name="data_analise")
	private Date dataAnalise;
	
	@Column(name="motivocq")
	private String motivoCQ;
	
	@Column(name="requisicao_compra")
	private String requisicaoCompra;
	
	@Column(name="pedido")
	private String pedido; // TODO verificar
	
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
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinTable(name="analise_usuario", joinColumns=
		{@JoinColumn(name="id_analise")}, inverseJoinColumns={@JoinColumn(name="id_usuario")}) 	
	private List<Usuario> usuarios = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(Integer mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public Integer getAnoReferencia() {
		return anoReferencia;
	}

	public void setAnoReferencia(Integer anoReferencia) {
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

	@Override
	public String toString() {
		return "Analise [id=" + id + ", mesReferencia=" + mesReferencia + ", anoReferencia=" + anoReferencia
				+ ", dataAnalise=" + dataAnalise + ", motivoCQ=" + motivoCQ + ", requisicaoCompra=" + requisicaoCompra
				+ ", pedido=" + pedido + ", descricaoProduto=" + descricaoProduto + ", dataSolicitacao="
				+ dataSolicitacao + ", localProcesso=" + localProcesso + ", numeroDemanda=" + numeroDemanda + ", ativo="
				+ ativo + ", observacaoAnalise=" + observacaoAnalise + ", tipoProcesso=" + tipoProcesso + ", equipe="
				+ equipe + "]";
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
