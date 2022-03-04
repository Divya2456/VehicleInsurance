package com.cpg.vehinsurance.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.vehinsurance.entity.Admin;
import com.cpg.vehinsurance.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
 

public Admin login(String userName, String password) {
	Admin user = adminRepository.findByUserNameAndPassword(userName, password);

	return user;
}


}


