package br.com.a3.spring.aula5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.a3.spring.aula5.entity.Usuario;
import br.com.a3.spring.aula5.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
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
