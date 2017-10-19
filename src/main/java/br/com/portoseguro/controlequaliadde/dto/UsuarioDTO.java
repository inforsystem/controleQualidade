package br.com.portoseguro.controlequaliadde.dto;

import java.util.Date;
import java.util.List;

import br.com.portoseguro.controlequalidade.entity.Equipe;
import br.com.portoseguro.controlequalidade.entity.Login;
import br.com.portoseguro.controlequalidade.entity.Perfil;
import br.com.portoseguro.controlequalidade.entity.Usuario;

public class UsuarioDTO implements DataTranferObject<Usuario, UsuarioDTO> {
	
	private static final long serialVersionUID = 7494082400766728182L;
	
	private Long id;
	private Date vigenciaInicial;
	private Date vigenciaFinal;
	private String nome;
	private String email;
	private Boolean ativo;
	private Integer meta;
	private Equipe equipe;
	private Perfil perfil;
	private Login login;
	private List<AnaliseDTO> analises;

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

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<AnaliseDTO> getAnalises() {
		return analises;
	}

	public void setAnalises(List<AnaliseDTO> analises) {
		this.analises = analises;
	}
	
	@Override
	public Usuario convertoToEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTO consumeEntity(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
