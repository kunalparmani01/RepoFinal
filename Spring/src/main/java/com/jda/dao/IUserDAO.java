package com.jda.dao;

import java.util.List;

import com.jda.model.UserModel;

public interface IUserDAO {

	
	public int registerUser(UserModel userModel);

	public List<UserModel> getUserByEmail(UserModel userModel);

	public boolean insertUuid(String uuid, String email);

	public boolean updateUser(String uuid, UserModel userModel);

}
