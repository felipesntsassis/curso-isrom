package br.com.a3.spring.aula3.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.a3.spring.aula3.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
