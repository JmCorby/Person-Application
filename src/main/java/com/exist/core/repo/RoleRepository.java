package com.exist.core.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.exist.core.model.Role;

@Repository
public interface RoleRepository extends JpaRepository <Role, Long>{
	//@Query("SELECT * FROM roles WHERE person_id = ?1")
	List<Role> findByPersonId(long personId);
	
	List<Role> findByRoleName(String roleName);
}
