package br.com.portoseguro.controlequalidade.entidade;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = -942886349355324666L;

	private Long id;
	private Integer matricula; //ok
	private String nome;       //ok
	private Boolean ativo;     //ok
	private String password;
	private String email;      //ok
	private String meta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public Usuario() {
	}

	public Usuario(Integer matricula, String nome, Boolean ativo) {
		this.matricula = matricula;
		this.nome = nome;
		this.ativo = ativo;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", matricula=" + matricula + ", nome=" + nome + ", ativo=" + ativo + ", password="
				+ password + ", email=" + email + ", meta=" + meta + "]";
	}

}
