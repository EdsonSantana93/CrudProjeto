package br.org.eureka.Eureka.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_perfilusuario")
public class PerfilUsuario {
	
	@Id
	@Column(name = "idusuario")
	private int idusuario;
	
	@Column (name="foto", length = 400 )
	private String foto; 
	
	@Column (name= "descricao", length = 600)
	private String descricao;
	
	
	
	@OneToOne
	@JsonIgnoreProperties("perfilUsuario")
	private  CadastroUsuario cadastroUsuario;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "perfilUsuario")
	@JsonIgnoreProperties("perfilUsuario")
	private List<Postagem> postagem;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "perfilUsuario")
	@JsonIgnoreProperties("perfilUsuario")
	private List<Comentario> comentario;
	

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CadastroUsuario getCadastroUsuario() {
		return cadastroUsuario;
	}

	public void setCadastroUsuario(CadastroUsuario cadastroUsuario) {
		this.cadastroUsuario = cadastroUsuario;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}
	
	

	

}
