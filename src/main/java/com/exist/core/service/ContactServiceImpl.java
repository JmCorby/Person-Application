package com.exist.core.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exist.core.model.Contact;
import com.exist.core.repo.ContactRepository;

@Service
public class ContactServiceImpl {
	
	@Autowired
	public ContactRepository contactRepository;
	
	public Contact addContact(Contact contact) {
		Contact validate = contactRepository.findByMobileNumberAndLandline(contact.mobileNumber, contact.landline).stream().findFirst().orElse(null);
		if (validate != null) {
			return validate;
		} else {
			contactRepository.save(contact);
			return contact;
		}
	}
	
	public void updateContact(Contact contact) {
		contactRepository.save(contact);
	}
	
	public void deleteContactById(long id) {
		try {
			contactRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println("Can not delete contact");
		}
	}
	
	public List<Contact> getContactByPersonId(long personId) {
		return contactRepository.findByPersonId(personId);
	}
	
	public List<Contact> getContacts() {
		try {
			var result = contactRepository.findAll();
			return result;
		} catch (Exception e) {
			return null;
		}
	}

}
