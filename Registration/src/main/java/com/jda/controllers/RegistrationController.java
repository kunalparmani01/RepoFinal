package com.jda.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jda.dao.JdbcUtil;
import com.jda.model.UserModel;

public class RegistrationController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel userModel = new UserModel();
		userModel.setFirstName(request.getParameter("first_name"));
		userModel.setLastName(request.getParameter("last_name"));
		userModel.setEmail(request.getParameter("email"));
		userModel.setPassword(request.getParameter("password"));
		userModel.setAddress(request.getParameter("address"));
		userModel.setPhoneNumber((request.getParameter("contact")));
		try {
			JdbcUtil jdbcUtil = new JdbcUtil();
			if (jdbcUtil.registerUser(userModel)) {
				System.out.println("user register");
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
				dispatcher.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
