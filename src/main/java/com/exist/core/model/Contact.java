package com.exist.core.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "Contacts")
public class Contact {
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "person_id")
	public Person person;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, columnDefinition = "serial")
	public long id;
	
	@Column(name = "landline")
	public String landline;
	
	@Column(name = "mobile_number")
	public String mobileNumber;

}
