package com.exist.core.model;

import java.io.Serializable;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "Persons")
public class Person implements Serializable {
	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	@JsonManagedReference
	public List<Contact> contacts;

	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	@JsonManagedReference
	public List<PersonRole> personRoles;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, columnDefinition = "serial")
	public long id;
	
	@Column(name = "first_name")
	public String firstName;

	@Column(name = "last_name")
	public String lastName;

	@Column(name = "middle_name")
	public String middleName;
	
	@Column(name = "suffix")
	public String suffix;

	@Column(name = "title")
	public String title;

	@Column(name = "birthday")
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy/MM/dd")
	public Date birthday;
	
	@Column(name = "gwa")
	public double generalWeightedAverage;
	
	@Column(name = "date_hired")
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy/MM/dd")
	public Date dateHired;
	
	@Column(name = "employment_status")
	public String employmentStatus;
	
	@Column(name = "street_number")
	public long streetNumber;
	
	@Column(name = "zipcode")
	public long zipcode;
	
	@Column(name = "barangay")
	public String barangay;
	
	@Column(name = "city")
	public String city;
	
	public double getGeneralWeightedAverage() {
		return generalWeightedAverage;
	}
	
	public Date getDateHired() {
		return dateHired;
	}
	
	public String getLastName() {
		return lastName;
	}
	
}
