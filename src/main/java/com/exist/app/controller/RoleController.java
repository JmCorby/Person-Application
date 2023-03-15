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
	
	@GetMapping("/roles/{personId}")
	public List<Role> getRoleByPersonId(@PathVariable("personId") long personId) {
		return roleServiceImpl.getRoleByPersonId(personId);
	}
	
	@PostMapping("/roles/save")
	public Role saveRole(@RequestBody Role role) {
		return roleServiceImpl.saveRole(role);
	}

}
