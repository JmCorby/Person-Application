package com.exist.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	//Add role
	@PostMapping("/roles/add")
	public Role addRole(@RequestBody Role role) {
		return roleServiceImpl.addRole(role);
	}
	
	//Update role
	@PutMapping("roles/update")
	public void updateRole(@RequestBody Role role) {
		roleServiceImpl.addRole(role);
	}
	
	//Delete role
	@DeleteMapping("roles/delete/{id}")
	public void deleteRole(@PathVariable("id") long id) {
		roleServiceImpl.deleteRoleById(id);
	}
}
