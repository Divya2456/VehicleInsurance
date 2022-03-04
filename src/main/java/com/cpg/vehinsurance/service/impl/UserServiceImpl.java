package com.cpg.vehinsurance.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cpg.vehinsurance.entity.User;
import com.cpg.vehinsurance.exception.UserNotFoundException;
import com.cpg.vehinsurance.repository.UserRepository;
import com.cpg.vehinsurance.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userrpository) {
		super();
		this.userRepository = userrpository;
	}

	@Override
	public List<User> getAlluser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User addUser(User user) {
		userRepository.save(user);
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	

	@Override
	public User validateUser(String userName, String userPassword) throws UserNotFoundException {
		
		//try {
		User user = userRepository.findByUserNameAndUserPassword(userName, userPassword);
         
    	System.out.print(user+" "+ userName+" "+userPassword );
    	if(user==null) {
    		throw  new UserNotFoundException("UserIsNotPresent");
    	}
    	
		return user;
		}
    
	}
			      

		
	
	
	

	

