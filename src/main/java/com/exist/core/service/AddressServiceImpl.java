package com.exist.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.exist.core.model.Address;
import com.exist.core.repo.AddressRepository;
import com.exist.core.repo.PersonRepository;

@Service
public class AddressServiceImpl {
	
	@Autowired
	public AddressRepository addressRepository;
	
	@Autowired
	public PersonRepository personRepository;
	
	public Address getAddresses(long id) {
		return addressRepository.findById(id).orElse(null);
	}
	
	public List<Address> getAllAddresses() {
		try {
			var result = addressRepository.findAll();
			return result;
		} catch (Exception e) {
			return null;
		}
	}
	
//	public Address saveAddress(Address address) {
//			var person = personRepository.findById(address.person.id).orElse(null);
//			address.person = person;
//			return addressRepository.save(address);
//	}

}
