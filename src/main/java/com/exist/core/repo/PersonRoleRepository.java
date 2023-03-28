package com.exist.core.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exist.core.model.PersonRole;

@Repository
public interface PersonRoleRepository extends JpaRepository <PersonRole, Long>{
	List<PersonRole> findByPersonId(long personId);
}
