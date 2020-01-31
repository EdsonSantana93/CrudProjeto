package br.org.eureka.Eureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name = "tbl_cadastrousuario")
public class CadastroUsuario {
 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "idusuario")
	private int idusuario;

	@Column(name="email", length = 150)
	private String email;  
	
	@Column (name= "nomeusuario", length = 150)
	private String nomeusuario; 
	
	@Column (name = "senha", length = 200)
	private String senha; 
	
	@Column (name="telefone", length = 20)
    private String telefone;
	
	@OneToOne
	@JsonIgnoreProperties("cadastroUsuario")
	private PerfilUsuario perfilUsuario;

	public int getIdusuario() {
		return idusuario;
	}

	public PerfilUsuario getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	

	
}
