package com.exist.core.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exist.core.model.Person;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long>{
	List<Person> findByFirstNameAndLastNameAndMiddleName(String firstName, String lastName, String middleName);
	Person findById(long id);
}
