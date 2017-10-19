package br.com.portoseguro.controlequaliadde.dto;

import java.util.Date;

import br.com.portoseguro.controlequalidade.entity.Analise;

public class AnaliseDTO implements DataTranferObject<Analise, AnaliseDTO> {

	private static final long serialVersionUID = -6617263430312377259L;

	private Long id;
	private Integer mesReferencia;
	private Integer anoReferencia;
	private Date dataAnalise;
	private String motivoCQ;
	private String requisicaoCompra;
	private String pedido;
	private String descricaoProduto;
	private Date dataSolicitacao;
	private String localProcesso;
	private String numeroDemanda;
	private Boolean ativo;
	private String observacaoAnalise;
	private Long tipoProcesso;
	private Long equipe;

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

	public Long getTipoProcesso() {
		return tipoProcesso;
	}

	public void setTipoProcesso(Long tipoProcesso) {
		this.tipoProcesso = tipoProcesso;
	}

	public Long getEquipe() {
		return equipe;
	}

	public void setEquipe(Long equipe) {
		this.equipe = equipe;
	}

	@Override
	public String toString() {
		return "AnaliseDTO [id=" + id + ", mesReferencia=" + mesReferencia + ", anoReferencia=" + anoReferencia
				+ ", dataAnalise=" + dataAnalise + ", motivoCQ=" + motivoCQ + ", requisicaoCompra=" + requisicaoCompra
				+ ", pedido=" + pedido + ", descricaoProduto=" + descricaoProduto + ", dataSolicitacao="
				+ dataSolicitacao + ", localProcesso=" + localProcesso + ", numeroDemanda=" + numeroDemanda + ", ativo="
				+ ativo + ", observacaoAnalise=" + observacaoAnalise + ", tipoProcesso=" + tipoProcesso + ", equipe="
				+ equipe + "]";
	}
	
	@Override
	public Analise convertoToEntity() {
		Analise analise = new Analise();
		analise.setAnoReferencia(this.getAnoReferencia());
		analise.setAtivo(this.getAtivo());
		analise.setDataAnalise(this.getDataAnalise());
		analise.setDataSolicitacao(this.getDataSolicitacao());
		analise.setDescricaoProduto(this.getDescricaoProduto());
		
		
		analise.setId(this.getId());
		analise.setLocalProcesso(this.getLocalProcesso());
		analise.setMesReferencia(this.getMesReferencia());
		analise.setMotivoCQ(this.getMotivoCQ());
		analise.setNumeroDemanda(this.getNumeroDemanda());
		analise.setObservacaoAnalise(this.getObservacaoAnalise());
		analise.setPedido(this.getPedido());
		analise.setRequisicaoCompra(this.getRequisicaoCompra());
		
		
		return analise;
	}

	@Override
	public AnaliseDTO consumeEntity(Analise entity) {
		this.setAnoReferencia(entity.getAnoReferencia());
		this.setAtivo(this.getAtivo());
		this.setDataAnalise(entity.getDataAnalise());
		this.setDataSolicitacao(entity.getDataSolicitacao());
		this.setDescricaoProduto(entity.getDescricaoProduto());
		return null;
	}

}
