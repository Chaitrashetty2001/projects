package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.repository.UserRepository;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		
		return   userRepository.save(user);
	}

	@Override
	public List<User> getUserByFname(String firstName) {
		
		return userRepository.findByFirstName(firstName);
	}
	
	

}
