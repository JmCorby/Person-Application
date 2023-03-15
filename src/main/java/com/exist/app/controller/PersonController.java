package com.exist.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.exist.core.model.Person;
import com.exist.core.service.PersonServiceImpl;

@RestController
@CrossOrigin
public class PersonController {
	
	@Autowired
	public PersonServiceImpl personServiceImpl;
	
	@GetMapping("/persons")
	public List<Person> getPerson() {
		return personServiceImpl.getPerson();
	}
	
	@PostMapping("/person/getbyname")
	public Person getPersonByName(@RequestBody Person person) {
		return personServiceImpl.getPersonByName(person);
	}
}
