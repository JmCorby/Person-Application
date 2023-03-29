package com.exist.core.model;

import java.io.*;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

import jakarta.persistence.*;

@Entity
@Table(name = "PersonRoles")
public class PersonRole implements Serializable{
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "person_id", insertable=false, updatable=false)
	public Person person;
	
	@ManyToOne
	@JoinColumn(name = "role_id", insertable=false, updatable=false)
	public Role role;
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, columnDefinition = "serial")
	public long id;
	
	@Column(name = "person_id")
	public long personId;
	
	@Column(name = "role_id")
	public long roleId;

}
