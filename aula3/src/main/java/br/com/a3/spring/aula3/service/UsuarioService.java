package br.com.a3.spring.aula3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.a3.spring.aula3.entity.Usuario;
import br.com.a3.spring.aula3.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}

	public List<Usuario> listarUsuarios(Usuario usuario) {
		usuarioRepository.save(usuario);
		
		return usuarioRepository.findAll();
	}
}
