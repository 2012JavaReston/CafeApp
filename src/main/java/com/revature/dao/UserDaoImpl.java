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
		User result = null;
		for(User u : userList) {
			if(u.getUsername().equals(n)) {
				result = u;
				break;
			}
		}
		return result;
	}

	@Override
	public List<User> selectAllUsers() {
		return userList;
	}

	@Override
	public boolean updateUser(User user) {
		boolean result = false;
		for(User u : userList) {
			if(u.getUsername().equals(user.getUsername())) {
				u = user;
				result = true;
				break;
			}
		}
		return result;
	}

	@Override
	public boolean deleteUser(User user) {
		boolean result = false;
		for(User u : userList) {
			if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
				userList.remove(u);
				result = true;
				break;
			}
		}
		return result;
	}

}
