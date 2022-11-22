package com.demo.services;

import java.util.List;

import com.demo.entity.User;

public interface UserService {

	User saveUser(User user);

	List<User> getUserByFname(String firstName);

}
