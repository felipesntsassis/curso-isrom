package br.com.a3.spring.aula6.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.a3.spring.aula6.entity.Perfil;

public interface PerfilRepository extends MongoRepository<Perfil, String> {

	List<Perfil> findByNomeLikeIgnoreCase(String nome);

}
