package br.edu.infnet.appendereco.model.repository;

import br.edu.infnet.appendereco.model.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
	
	public Role findByNome(String nome);

}
