//package com.exist.app.controller;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//
//import com.exist.core.model.Address;
//import com.exist.core.service.AddressServiceImpl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.*;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin
//public class AddressController {
//	
//	@Autowired
//	public AddressServiceImpl addressServiceImpl;
//
//	@GetMapping("/address/{id}")
//	public Address getAddress(@PathVariable("id")long id) {
//		return addressServiceImpl.getAddresses(id);
//	}
//	
//	@GetMapping("/addresses")
//	public List<Address> getAllAddress() {
//		return addressServiceImpl.getAllAddresses();
//	}
//	
//	@PostMapping("/address/saveAddress")
//	public Address saveAddress(@RequestBody Address address) {
//		return addressServiceImpl.saveAddress(address);
//	}
//}
