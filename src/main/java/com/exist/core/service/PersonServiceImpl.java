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
	
	public Person getPersonById(long id) {
		return personRepository.findById(id);
	}
	
	public List<Person> getPersons() {
		return personRepository.findAll();
	}
	
	public Person getPersonByName(Person person) {
		Person validate = personRepository.findByFirstNameAndLastNameAndMiddleName(person.firstName, person.lastName, person.middleName).stream()
				.findFirst().orElse(null);
		if (validate != null) {
			return validate;
		} else {
			personRepository.save(person);
			return person;
		}
	}
	
	public void deletePersonById(long id) {
		personRepository.deleteById(id);
	}
	
	public void saveOrUpdate(Person person) {
		personRepository.save(person);
	}

}
