package com.exist.core.model;

import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name = "Persons")
public class Person {
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	public List<Address> address;

	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	public List<Role> roles;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	public Date birthday;
	
	@Column(name = "gwa")
	public double generalWeightedAverage;
	
	@Column(name = "date_hired")
	@Temporal(TemporalType.DATE)
	public Date dateHired;
	
	@Column(name = "landline")
	public String landline;
	
	@Column(name = "mobile_number")
	public String mobileNumber;
	
	@Column(name = "employment_status")
	public String employmentStatus;
	
}
