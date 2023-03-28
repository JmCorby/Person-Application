package com.exist.core.model;

import java.io.*;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

import jakarta.persistence.*;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "PersonRoles")
public class PersonRole implements Serializable{
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "person_id")
	public Person person;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	public Role role;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, columnDefinition = "serial")
	public long id;

}
