package com.exist.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.exist.core.model.PersonRole;
import com.exist.core.model.Role;
import com.exist.core.repo.PersonRepository;
import com.exist.core.repo.PersonRoleRepository;

@Service
public class PersonRoleServiceImpl {
	
	@Autowired
	public PersonRoleRepository personRoleRepo;
	
	@Autowired
	public PersonRepository personRepository;
	
	public PersonRole addPersonRole(PersonRole personRole) {
		PersonRole validate = personRoleRepo.findById(personRole.id).stream().findFirst().orElse(null);
		if (validate != null) {
			return validate;
		} else {
			personRoleRepo.save(personRole);
			return personRole;
		}
	}

}




