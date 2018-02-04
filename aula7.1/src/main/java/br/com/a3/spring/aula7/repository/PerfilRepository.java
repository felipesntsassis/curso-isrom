package br.com.a3.spring.aula7.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.a3.spring.aula7.entity.Perfil;

public interface PerfilRepository extends MongoRepository<Perfil, String> {

	public List<Perfil> findByNomeLikeIgnoreCase(String nome);

	public Perfil findByNome(String string);

}
