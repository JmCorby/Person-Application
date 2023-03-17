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
	
	@GetMapping("/persons/{id}")
	public Person getPersonById(@PathVariable("id")long id) {
		return personServiceImpl.getPersonById(id);
	}
	
	@GetMapping("/persons")
	public List<Person> getPersons() {
		try {
			return personServiceImpl.getPersons();
		} catch (Exception e) {
			return null;
		}
	}
	
	@PostMapping("/person/getbyname")
	public Person getPersonByName(@RequestBody Person person) {
		return personServiceImpl.getPersonByName(person);
	}
}
