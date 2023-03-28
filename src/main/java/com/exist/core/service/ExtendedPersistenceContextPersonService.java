package com.exist.core.service;

import org.springframework.stereotype.*;

import com.exist.core.model.Person;

import jakarta.persistence.*;
import jakarta.transaction.*;

@Component
public class ExtendedPersistenceContextPersonService {
	
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;
	
    @Transactional
    public Person insertWithTransaction(Person person) {
        entityManager.persist(person);
        return person;
    }

    public Person insertWithoutTransaction(Person person) {
        entityManager.persist(person);
        return person;
    }
    
    public Person find(long id) {
        Person person = entityManager.find(Person.class, id);
        return person;
    }

}
