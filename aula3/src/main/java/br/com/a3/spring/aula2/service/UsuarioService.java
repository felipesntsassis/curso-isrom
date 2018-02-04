package br.com.a3.spring.aula2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.a3.spring.entity.Usuario;

@Service
public class UsuarioService {

	public List<Usuario> listUsuario() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario = new Usuario();
		usuario.setNome("Felipe dos Santos Assis");
		usuario.setIdade(32);
		usuario.setEmail("felipesntsassis@gmail.com");
		usuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setNome("Suellen Aparecida Garcia Moreira Assis");
		usuario.setIdade(32);
		usuario.setEmail("suell.moreira@yahoo.com.br");
		usuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setNome("Isabelle Moreira Assis");
		usuario.setIdade(3);
		usuario.setEmail("isabellemassis@gmail.com");
		usuarios.add(usuario);
		
		return usuarios;
	}

	public List<Usuario> listUsuario(Usuario usuario) {
		List<Usuario> usuarios = this.listUsuario();
		usuarios.add(usuario);
		
		return usuarios;
	}
}
