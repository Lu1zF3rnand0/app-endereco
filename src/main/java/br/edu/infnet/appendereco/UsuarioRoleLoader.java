package br.edu.infnet.appendereco;

import br.edu.infnet.appendereco.model.domain.Endereco;
import br.edu.infnet.appendereco.model.domain.Role;
import br.edu.infnet.appendereco.model.domain.Usuario;
import br.edu.infnet.appendereco.model.service.RoleService;
import br.edu.infnet.appendereco.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class UsuarioRoleLoader implements ApplicationRunner{

	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		roleService.incluir(new Role("ROLE_ADMIN"));
		roleService.incluir(new Role("ROLE_USER"));
		
		Endereco endereco1 = new Endereco();
		endereco1.setBairro("Bairro 1");
		endereco1.setCep("25000-002");
		endereco1.setComplemento("Complemento 1");
		endereco1.setLocalidade("Localidade 1");
		endereco1.setLogradouro("Logradouro 1");
		endereco1.setUf("UF");
		
		Usuario usuario1 = new Usuario();
		usuario1.setEmail("usuario1@usuario.com");
		usuario1.setEndereco(endereco1);
		usuario1.setNome("Usuario 1");
		usuario1.setRoles(Arrays.asList(new Role(1)));
		usuario1.setSenha("senha1");
		
		usuarioService.incluir(usuario1);
		
		Endereco endereco2 = new Endereco();
		endereco2.setBairro("Bairro 2");
		endereco2.setCep("25000-001");
		endereco2.setComplemento("Complemento 2");
		endereco2.setLocalidade("Localidade 2");
		endereco2.setLogradouro("Logradouro 2");
		endereco2.setUf("UF");
		
		Usuario usuario2 = new Usuario();
		usuario2.setEmail("usuario2@usuario.com");
		usuario2.setEndereco(endereco2);
		usuario2.setNome("Usuario 2");
		usuario2.setRoles(Arrays.asList(new Role(2)));
		usuario2.setSenha("senha2");
		
		usuarioService.incluir(usuario2);
		
	}

}
