package com.cpg.vehinsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cpg.vehinsurance.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	User findByUserNameAndUserPassword(String userName ,String userPassword);

	}
	

