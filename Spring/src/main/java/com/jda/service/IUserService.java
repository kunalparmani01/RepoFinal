package com.jda.service;

import com.jda.model.UserModel;

public interface IUserService {

	
	 public boolean registerUser(UserModel userModel);

	public UserModel loginUser(UserModel userModel);

	public boolean forgotPassword(UserModel userModel, String requestUrl);

	public boolean resetPassword(String requestUrl, UserModel userModel);
}
