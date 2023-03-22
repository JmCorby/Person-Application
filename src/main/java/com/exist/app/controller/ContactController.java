package com.exist.app.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exist.core.model.Contact;
import com.exist.core.service.ContactServiceImpl;

@RestController
@CrossOrigin
public class ContactController {
	
	@Autowired
	public ContactServiceImpl contactServiceImpl;
	
	//Add contact
	@PostMapping("contact/add") 
	public Contact addContact(@RequestBody Contact contact) {
		return contactServiceImpl.addContact(contact);
	}
	
	//Update contact
	@PutMapping("contact/update")
	public void updateContact(@RequestBody Contact contact) {
		contactServiceImpl.addContact(contact);
	}
	
	//Delete contact
	@DeleteMapping("contact/delete/{id}")
	public void deleteContactById(@PathVariable("id")long id) {
		contactServiceImpl.deleteContactById(id);
	}
	
	//Get contact by id
	@GetMapping("/contacts/{personId}")
	public List<Contact> getContactsByPersonId(@PathVariable("personId") long personId) {
		return contactServiceImpl.getContactByPersonId(personId);
	}
	
	//Get contacts 
	@GetMapping("/contacts")
	public List<Contact> getContacts() {
		return contactServiceImpl.getContacts();
	}

}
