package com.cpg.vehinsurance.service;

import java.util.List;

import com.cpg.vehinsurance.entity.User;
import com.cpg.vehinsurance.exception.UserNotFoundException;



public interface UserService {
	
	List<User> getAlluser();
public User addUser(User user);
public User validateUser(String username,  String password)throws UserNotFoundException;


}