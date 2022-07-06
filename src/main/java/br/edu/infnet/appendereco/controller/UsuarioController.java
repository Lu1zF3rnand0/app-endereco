package br.edu.infnet.appendereco.controller;

import br.edu.infnet.appendereco.model.domain.Endereco;
import br.edu.infnet.appendereco.model.domain.Role;
import br.edu.infnet.appendereco.model.domain.Usuario;
import br.edu.infnet.appendereco.model.service.RoleService;
import br.edu.infnet.appendereco.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping(value="/usuario")
	public String telaCadastro(Model model) {
		
		model.addAttribute("roles", roleService.obterLista());
		
		return "usuario/cadastro";
	}
	
	@PostMapping(value="/usuario/incluir")
	public String incluir(Usuario usuario, Endereco endereco, @RequestParam Integer acesso) {
		
		usuario.setEndereco(endereco);
		usuario.setRoles(Arrays.asList(new Role(acesso)));
		usuarioService.incluir(usuario);
		
		return "redirect:/";
	}

}
