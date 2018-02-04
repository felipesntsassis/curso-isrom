package br.com.a3.spring.aula2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.a3.spring.aula2.service.UsuarioService;
import br.com.a3.spring.entity.Usuario;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public List<Usuario> listUsuario() {
		return this.usuarioService.listUsuario();
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public List<Usuario> listUsuario(@RequestBody Usuario usuario) {
		return this.usuarioService.listUsuario(usuario);
	}
}
