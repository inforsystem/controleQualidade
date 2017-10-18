package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cadastrar_usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -942886349355324666L;

	@Id
	@Column(name="id_usuario")
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="vigencia_inicial")
	private Date vigenciaInicial;
	
	@Temporal(TemporalType.DATE)
	@Column(name="vigencia_final")
	private Date vigenciaFinal;
	
	@Column(name="nome_usuario")
	private String nome;
	
	@Column(name="email_usuario")
	private String email;
	
	@Column(name="status_usuario")
	private Boolean ativo;
	
	@Column(name="meta_usuario")
	private Integer meta;
	
	@ManyToOne
	@JoinColumn(name="id_equipe")
	private Equipe equipe;
	
	@ManyToOne
	@JoinColumn(name="id_perfil")
	private Perfil perfil;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getVigenciaInicial() {
		return vigenciaInicial;
	}

	public void setVigenciaInicial(Date vigenciaInicial) {
		this.vigenciaInicial = vigenciaInicial;
	}

	public Date getVigenciaFinal() {
		return vigenciaFinal;
	}

	public void setVigenciaFinal(Date vigenciaFinal) {
		this.vigenciaFinal = vigenciaFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Integer getMeta() {
		return meta;
	}

	public void setMeta(Integer meta) {
		this.meta = meta;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", vigenciaInicial=" + vigenciaInicial + ", vigenciaFinal=" + vigenciaFinal
				+ ", nome=" + nome + ", email=" + email + ", ativo=" + ativo + ", meta=" + meta + ", equipe=" + equipe
				+ ", perfil=" + perfil + "]";
	}
	
}
