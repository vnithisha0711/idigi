package com.capgemini.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.authentication.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
	 	 
	    Role findByName(String name);

}
