package br.com.a3.spring.aula6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.a3.spring.aula6.entity.Perfil;
import br.com.a3.spring.aula6.repository.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	PerfilRepository perfilRepository;
	
	public List<Perfil> listarPerfis() {
		return perfilRepository.findAll();
	}
	
	public Page<Perfil> listarPaginada(int count, int page) {
		Pageable pages = new PageRequest(page, count);
		
		return perfilRepository.findAll(pages);
	}

	public List<Perfil> buscarPorNome(String nome) {
		return perfilRepository.findByNomeLikeIgnoreCase(nome);
	}

	public Perfil salvarPerfil(Perfil Perfil) {
		return perfilRepository.save(Perfil);
	}

	public void deletarPerfil(String id) {
		perfilRepository.delete(id);
	}

	public Perfil consultarPerfil(String id) {
		return perfilRepository.findOne(id);
	}
}
