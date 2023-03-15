package com.exist.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
public class Role {
	
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "person_id", referencedColumnName = "id")
	public Person person;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@Column(name = "role_name")
	public String roleName;

}
