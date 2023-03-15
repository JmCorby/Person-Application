package com.exist.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exist.core.model.Address;

@Repository
public interface AddressRepository extends JpaRepository <Address, Long>{
	Address findByPersonId(long person_id);
}
