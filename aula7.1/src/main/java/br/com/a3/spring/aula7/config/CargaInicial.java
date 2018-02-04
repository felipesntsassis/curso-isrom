package br.com.a3.spring.aula7.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.a3.spring.aula7.entity.Perfil;
import br.com.a3.spring.aula7.entity.Usuario;
import br.com.a3.spring.aula7.repository.PerfilRepository;
import br.com.a3.spring.aula7.repository.UsuarioRepository;

@Component
public class CargaInicial implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private PerfilRepository perfilRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent e) {
		List<Perfil> perfis = perfilRepository.findAll();
		
		if (perfis.isEmpty()) {
			perfilRepository.save(new Perfil("ROLE_ADMIN"));
			Perfil perfil = perfilRepository.findByNome("ROLE_ADMIN");
			
			List<Perfil> perfisUsuario = new ArrayList<Perfil>();
			perfisUsuario.add(perfil);
			usuarioRepository.save(new Usuario("Felipe dos Santos Assis", "adm@gmail.com", "admin123", perfisUsuario));
		}
	}

	
}
