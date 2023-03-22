package com.exist.app.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.exist.core.model.Person;
import com.exist.core.service.PersonServiceImpl;

@RestController
@CrossOrigin
public class PersonController {
	
	@Autowired
	public PersonServiceImpl personServiceImpl;
	
	//Get person by id
	@GetMapping("/persons/{id}")
	public Person getPersonById(@PathVariable("id")long id) {
		return personServiceImpl.getPersonById(id);
	}
	
	//Delete person by id
	@DeleteMapping("/person/delete/{id}") 
	public void deletePersonById(@PathVariable("id")long id) {
		personServiceImpl.deletePersonById(id);
	}
	
	//Update person by id
	@PutMapping("/person/update")
	public void updatePerson(@RequestBody Person person) {
		personServiceImpl.saveOrUpdate(person);
	}
	
	//Get all persons
	@GetMapping("/persons")
	public List<Person> getPersons() {
		try {
			return personServiceImpl.getPersons();
		} catch (Exception e) {
			return null;
		}
	}
	
	//Get persons by gwa,dateHired,lastName
	@GetMapping("/persons/sort/{sortField}")
    public List<Person> getPersonsWithSorting(@PathVariable("sortField")String sortField) {
        var persons = personServiceImpl.getPersons();
        List<Person> result = null;
        if (sortField.equals("gwa")) {
            result = (List<Person>) persons
                .stream().sorted(Comparator.comparing(Person::getGeneralWeightedAverage))
                .collect(Collectors.toList());
        } else if (sortField.equals("dateHired")) {
            result = (List<Person>) persons
                .stream().sorted(Comparator.comparing(Person::getDateHired))
                .collect(Collectors.toList());
        } else if (sortField.equals("lastName")) {
        	result = (List<Person>) persons
        		.stream().sorted(Comparator.comparing(Person::getLastName))
        		.collect(Collectors.toList());
        }
        return result;
    }
	
	//Create or add new person
	@PostMapping("/person/create")
	public Person getPersonByName(@RequestBody Person person) {
		return personServiceImpl.getPersonByName(person);
	}
	
}
