package com.exist.core.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exist.core.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{
	
	List<Contact> findByPersonId(long personId);
	List<Contact> findByMobileNumberAndLandline(String mobileNumber, String landline);

}
