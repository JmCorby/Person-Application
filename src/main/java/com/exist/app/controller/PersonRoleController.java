package com.exist.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.exist.core.model.PersonRole;
import com.exist.core.service.PersonRoleServiceImpl;

@RestController
@CrossOrigin
public class PersonRoleController {
	
	@Autowired
	public PersonRoleServiceImpl personRoleServiceImpl;
	
	//Add person role
	@PostMapping("/personroles/add")
	public PersonRole addPersonRole(@RequestBody PersonRole personRole) {
		return personRoleServiceImpl.addPersonRole(personRole);
	}
	
	//Get person roles
	@GetMapping("/personroles")
	public List<PersonRole> getPersonRoles() {
		return personRoleServiceImpl.getPersonRoles();
	}
	
	//Delete person role
	@DeleteMapping("/personroles/delete/{id}")
	public void deletePersonRoleById(@PathVariable("id")long id) {
		personRoleServiceImpl.deletePersonRoleById(id);
	}
}
