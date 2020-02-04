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
	@Column(name = "idUsuario")
	private int idUsuario;

	@Column(name="email", length = 150)
	private String email;  
	
	@Column (name= "nome", length = 150)
	private String nome; 
	
	@Column (name = "senha", length = 200)
	private String senha; 
	
	@Column (name="telefone", length = 20)
    private String telefone;
	
	@OneToOne
	@JsonIgnoreProperties("cadastroUsuario")
	private PerfilUsuario perfilUsuario;

	public int getIdusuario() {
		return idUsuario;
	}

	public PerfilUsuario getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	public void setIdusuario(int idusuario) {
		this.idUsuario = idusuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
