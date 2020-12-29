package com.revature.dao;

import java.util.List;

import com.revature.models.User;

public interface UserDao {
	
	//CREATE
	public boolean createUser(User u);
	
	//READ
	public User selectUserByUsername(String n);
	public List<User> selectAllUsers();
	
	//UPDATE
	public boolean updateUser(User u);
	
	//DELETE
	public boolean deleteUser(User u);

}
