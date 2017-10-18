package br.com.portoseguro.controlequalidade.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cadastrar_login")
@NamedQueries(
	@NamedQuery(name=Login.BUSCAR_POR_SENHA, query="SELECT l FROM Login l WHERE l.password = :pswd")
)
public class Login implements Serializable {

	private static final long serialVersionUID = -3389847959528734098L;
	
	public static final String BUSCAR_POR_SENHA = "Login.buscarPorSenha";

	@Id
	@Column(name="id_login")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="senha_login")
	private String password;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", password=" + password + ", usuario=" + usuario + "]";
	}

}
