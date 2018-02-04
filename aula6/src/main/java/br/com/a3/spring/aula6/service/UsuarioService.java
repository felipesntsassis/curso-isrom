package br.com.a3.spring.aula6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.a3.spring.aula6.entity.Usuario;
import br.com.a3.spring.aula6.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}
	
	public Page<Usuario> listarPaginada(int count, int page) {
		Pageable pages = new PageRequest(page, count);
		
		return usuarioRepository.findAll(pages);
	}

	public List<Usuario> buscarPorNome(String nome) {
		return usuarioRepository.findByNomeLikeIgnoreCase(nome);
	}

	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public void deletarUsuario(String id) {
		usuarioRepository.delete(id);
	}

	public Usuario consultarUsuario(String id) {
		return usuarioRepository.findOne(id);
	}
}
