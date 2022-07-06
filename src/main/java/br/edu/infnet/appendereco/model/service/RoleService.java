package br.edu.infnet.appendereco.model.service;

import br.edu.infnet.appendereco.model.domain.Role;
import br.edu.infnet.appendereco.model.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	public void incluir(Role role) {
		roleRepository.save(role);
	}

	public List<Role> obterLista() {
		return (List<Role>) roleRepository.findAll();
	}

	public Role obterPorId(String nome) {
		return roleRepository.findByNome(nome);
	}

}
