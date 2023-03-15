package com.exist.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Addresses")
public class Address {
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "person_id", referencedColumnName = "id")
	public Person person;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@Column(name = "street_number")
	public long streetNumber;
	
	@Column(name = "zipcode")
	public long zipcode;
	
	@Column(name = "barangay")
	public String barangay;
	
	@Column(name = "city")
	public String city;

}
