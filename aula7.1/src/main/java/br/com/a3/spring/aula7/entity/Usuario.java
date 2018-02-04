package br.com.a3.spring.aula7.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entidade Usuário.
 * @author Felipe dos Santos Assis - felipesntsassis@gmail.com
 * @package br.com.a3.spring.entity
 * @since 04/02/2018
 */
@Document
public class Usuario {

	@Id
	private String id;

	private String nome;

	private Integer idade;

	private String email;

	private String senha;


	public Usuario() {
	}

	public Usuario(Usuario usuario) {
		this.nome = usuario.getNome();
		this.idade = usuario.getIdade();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		this.perfis = usuario.getPerfis();
	}

	public Usuario(String nome, String email, String senha, List<Perfil> perfis) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.perfis = perfis;
	}

	@DBRef
	private List<Perfil> perfis;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
