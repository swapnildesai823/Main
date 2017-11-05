package com.smsone.service;

import com.smsone.model.House;
import com.smsone.model.User;

public interface UserService {
	public void saveUser(User user);
	public void updateUser(User user);
	public boolean checkEmail(User user);
	public boolean checkContactNumber(User user);
	public boolean checkAadharNumber(User user);
	public User checkLogin(User user);
	public User verifyUserAccount(User user);
	public User sendNewLink(User user);
	public User getUser(User user);
}
