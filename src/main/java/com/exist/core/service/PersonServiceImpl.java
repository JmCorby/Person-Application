package com.exist.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.exist.core.repo.PersonRepository;
import com.exist.core.model.Person;

@Service
public class PersonServiceImpl {
	
	@Autowired
	public PersonRepository personRepository;
	
	public List<Person> getPerson() {
		return personRepository.findAll();
	}
	
	public Person getPersonByName(Person person) {
		Person first = personRepository.findByFirstNameAndLastName(person.firstName, person.lastName).stream()
				.findFirst().orElse(null);
		if (first != null) {
			return first;
		} else {
			personRepository.save(person);
			return person;
		}
	}

}
