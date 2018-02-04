package br.com.a3.spring.aula7.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

/**
 * Entidade Perfil.
 * @author Felipe dos Santos Assis - felipesntsassis@gmail.com
 * @package br.com.a3.spring.aula6.entity
 * @since 04/02/2018
 */
@Document
public class Perfil implements GrantedAuthority {

	private static final long serialVersionUID = 2839932600452682034L;

	@Id
	private String id;
	
	private String nome;

	public Perfil() {
	}

	public Perfil(String nome) {
		this.nome = nome;
	}

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

	@Override
	public String getAuthority() {
		return nome;
	}
}
