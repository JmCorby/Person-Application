package com.exist.core.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
public class Role {
	
	@OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
	public List<PersonRole> personRoles;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, columnDefinition = "serial")
	public long id;
	
	@Column(name = "role", unique = true)
	public String role;
}
