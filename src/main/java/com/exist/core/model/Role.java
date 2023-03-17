package com.exist.core.model;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

import jakarta.persistence.*;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name = "Roles")
public class Role implements Serializable{
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "person_id")
	public Person person;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, columnDefinition = "serial")
	public long id;
	
	@Column(name = "role_name")
	public String roleName;

}
