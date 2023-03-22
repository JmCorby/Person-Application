//package com.exist.core.model;
//
//import java.io.Serializable;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//
//import jakarta.persistence.*;
//
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@Entity
//@Table(name = "Addresses")
//public class Address implements Serializable {
//	@OneToOne
//	@JsonBackReference
//	@JoinColumn(name = "person_id")
//	public Person person;
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id", updatable = false, columnDefinition = "serial")
//	public long id;
//	
//	@Column(name = "street_number")
//	public long streetNumber;
//	
//	@Column(name = "zipcode")
//	public long zipcode;
//	
//	@Column(name = "barangay")
//	public String barangay;
//	
//	@Column(name = "city")
//	public String city;
//
//}
