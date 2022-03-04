package com.cpg.vehinsurance.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpg.vehinsurance.entity.Admin;



@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	


	Admin findByUserNameAndPassword(String userName, String password);
	

}