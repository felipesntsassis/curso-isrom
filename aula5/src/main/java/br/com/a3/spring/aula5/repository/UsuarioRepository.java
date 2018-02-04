package br.com.a3.spring.aula5.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.a3.spring.aula5.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

	public List<Usuario> findByNomeLikeIgnoreCase(String nome);

}
