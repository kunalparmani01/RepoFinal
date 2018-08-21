package com.jda.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.jda.model.UserModel;

public interface IJdbcUtil {

	 public Connection getConnection() throws ClassNotFoundException;
	 
	 public boolean registerUser(UserModel userModel ) throws ClassNotFoundException;
	 
	 public UserModel loginUser(UserModel userModel) throws ClassNotFoundException, SQLException;
	 
}