package br.com.portoseguro.controlequaliadde.dto;

import java.io.Serializable;

public class DadosExemploDTO implements Serializable {

	private static final long serialVersionUID = -5286540611526559013L;

	private Integer qtdeMes;
	private Integer mes;
	private Integer qtdeMotivo;
	private Integer qtdeProcesso;
	
	public DadosExemploDTO() {
	}

	public DadosExemploDTO(Integer qtdeMes, Integer mes, Integer qtdeMotivo, Integer qtdeProcesso) {
		this.qtdeMes = qtdeMes;
		this.mes = mes;
		this.qtdeMotivo = qtdeMotivo;
		this.qtdeProcesso = qtdeProcesso;
	}
	
	public Integer getQtdeMes() {
		return qtdeMes;
	}

	public void setQtdeMes(Integer qtdeMes) {
		this.qtdeMes = qtdeMes;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getQtdeMotivo() {
		return qtdeMotivo;
	}

	public void setQtdeMotivo(Integer qtdeMotivo) {
		this.qtdeMotivo = qtdeMotivo;
	}

	public Integer getQtdeProcesso() {
		return qtdeProcesso;
	}

	public void setQtdeProcesso(Integer qtdeProcesso) {
		this.qtdeProcesso = qtdeProcesso;
	}

	@Override
	public String toString() {
		return "DadosExemploDTO [qtdeMes=" + qtdeMes + ", mes=" + mes + ", qtdeMotivo=" + qtdeMotivo + ", qtdeProcesso="
				+ qtdeProcesso + "]";
	}

}
