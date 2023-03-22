package com.exist.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.exist.core.model.Role;
import com.exist.core.service.RoleServiceImpl;

@RestController
@CrossOrigin
public class RoleController {
	
	@Autowired
	public RoleServiceImpl roleServiceImpl;
	
	//Get roles
	@GetMapping("/roles")
	public List<Role> getRoles() {
		return roleServiceImpl.getRoles();
	}
	
	//Get role by id
	@GetMapping("/roles/{personId}")
	public List<Role> getRoleByPersonId(@PathVariable("personId") long personId) {
		return roleServiceImpl.getRoleByPersonId(personId);
	}
	
	//Add role
	@PostMapping("/roles/add")
	public Role saveRole(@RequestBody Role role) {
		return roleServiceImpl.saveRole(role);
	}
	
	//Delete role
	@DeleteMapping("role/delete/{id}")
	public void deleteRoleById(@PathVariable("id")long id) {
		roleServiceImpl.deleteRoleById(id);
	}
	
	//Update role
	@PutMapping("role/update") 
	public void updateRole(Role role) {
		roleServiceImpl.saveRole(role);
	}

}
