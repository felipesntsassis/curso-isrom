package br.com.a3.spring.aula6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.a3.spring.aula6.entity.Perfil;
import br.com.a3.spring.aula6.service.PerfilService;

@RestController
public class PerfilController {

	@Autowired
	PerfilService perfilService;

	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
	public List<Perfil> listarPerfil() {
		return this.perfilService.listarPerfis();
	}

	@RequestMapping(value = "/perfil/{page}/{count}", method = RequestMethod.GET)
	public Page<Perfil> listarPerfilPaginado(@PathVariable int page, @PathVariable int count) {
		return this.perfilService.listarPaginada(count, page);
	}

	@RequestMapping(value = "/perfil/{nome}/nome", method = RequestMethod.GET)
	public List<Perfil> listarPerfilPorNome(@PathVariable String nome) {
		return this.perfilService.buscarPorNome(nome);
	}

	@RequestMapping(value = "/perfil", method = RequestMethod.POST)
	public Perfil salvarPerfil(@RequestBody Perfil Perfil) {
		return this.perfilService.salvarPerfil(Perfil);
	}

	@RequestMapping(value = "/perfil", method = RequestMethod.PUT)
	public Perfil editarPerfil(@RequestBody Perfil Perfil) {
		return this.perfilService.salvarPerfil(Perfil);
	}

	@RequestMapping(value = "/perfil/{id}", method = RequestMethod.DELETE)
	public void deletarPerfil(@PathVariable String id) {
		this.perfilService.deletarPerfil(id);
	}

	@RequestMapping(value = "/perfil/{id}", method = RequestMethod.GET)
	public Perfil consultarPerfil(@PathVariable String id) {
		return this.perfilService.consultarPerfil(id);
	}

}
