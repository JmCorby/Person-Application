package com.exist.core.repo;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.exist.core.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	List<Role> findByRoleIgnoreCase(String role);
}
