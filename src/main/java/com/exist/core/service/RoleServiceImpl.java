package com.exist.core.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.exist.core.repo.RoleRepository;
import com.exist.core.model.Role;

@Service
public class RoleServiceImpl {
	@Autowired
	public RoleRepository roleRepository;

	public List<Role> getRoles() {
		return roleRepository.findAll();
	}
	
	public Role addRole(Role role) {
		Role validate = roleRepository.findByRoleIgnoreCase(role.role).stream().findFirst().orElse(null);
		if (validate != null) {
			return validate;
		} else {
			roleRepository.save(role);
			return role;
		}
	}
	
	public void deleteRoleById(long id) {
		try {
			roleRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println("Can not delete role");
		}
	}

}
