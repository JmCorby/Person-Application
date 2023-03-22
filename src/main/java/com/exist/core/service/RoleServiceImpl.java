package com.exist.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import com.exist.core.model.Role;
import com.exist.core.repo.PersonRepository;
import com.exist.core.repo.RoleRepository;

@Service
public class RoleServiceImpl {
	
	@Autowired
	public RoleRepository roleRepository;
	
	@Autowired
	public PersonRepository personRepository;
	
	public List<Role> getRoles() {
		try {
			var result = roleRepository.findAll();
			return result;
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Role> getRoleByPersonId(long personId) {
		return roleRepository.findByPersonId(personId);
	}
	
	public Role saveRole(Role role) {
		Role validate = roleRepository.findByRoleName(role.roleName).stream().findFirst().orElse(null);
		if (validate != null) {
			return validate;
		} else {
			roleRepository.save(role);
			return role;
		}
	}
	
	public void deleteRoleById(long id) {
		try {
			personRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println("Can not delete role since Person still exists.");
		}
	}
	
	public void updateRole(Role role) {
		roleRepository.save(role);
	}
}




