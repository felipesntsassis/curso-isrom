package br.com.a3.spring.aula7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.a3.spring.aula7.config.MyUserDetails;
import br.com.a3.spring.aula7.entity.Usuario;
import br.com.a3.spring.aula7.repository.UsuarioRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	/**
	 * (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByEmail(username);
		
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuário ou senha inválidos!");
		}
		
		return new MyUserDetails(usuario);
	}

	
}
