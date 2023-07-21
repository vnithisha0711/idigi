package com.capgemini.authentication.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.authentication.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User,Long>{
 
	User findByEmail(String email);
	 
    boolean existsByEmail(String email);
 
 
}
