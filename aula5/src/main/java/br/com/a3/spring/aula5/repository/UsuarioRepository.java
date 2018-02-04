package br.com.a3.spring.aula5.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.a3.spring.aula5.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
