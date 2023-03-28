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
	
	//Add role
	@PostMapping("/personRoles/add")
	public PersonRole addPersonRole(@RequestBody PersonRole personRole) {
		return personRoleServiceImpl.addPersonRole(personRole);
	}
	
}
