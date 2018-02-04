package br.com.a3.spring.aula4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
		return "Endpoint Inicial";
	}

}
