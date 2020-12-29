package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;

public class UserDaoImpl implements UserDao {

	private static List<User> userList = new ArrayList<>();
	
	@Override
	public boolean createUser(User newUser) {
		boolean found = false;
		boolean result = false;
		for(User u : userList) {
			if(u.getUsername().equals(newUser.getUsername())) {
				found = true;
				break;
			}
		}
		if(!found) {
			userList.add(newUser);
			result = true;
		}
		return result;
	}

	@Override
	public User selectUserByUsername(String n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

}
