package br.com.a3.spring.aula2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.a3.spring.entity.Usuario;

/**
 * Classe controladora inicial
 * @author Felipe dos Santos Assis - felipesntsassis@gmail.com
 * @package br.com.a3.spring.aula1.controller
 * @since 04/02/2018
 */
@RestController
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getTexto() {
		return "Olá pessoal!";
	}

	@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
	public Usuario getTexto(@PathVariable String nome) {
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		
		return usuario;
	}

}
