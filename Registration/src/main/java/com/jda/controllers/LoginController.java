package com.jda.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jda.dao.JdbcUtil;
import com.jda.model.UserModel;

public class LoginController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel userModel = new UserModel();
		userModel.setEmail(request.getParameter("username"));
		userModel.setPassword(request.getParameter("password"));
		System.out.println("heree");

		UserModel user = new UserModel();

		try {
			JdbcUtil jdbcUtil = new JdbcUtil();
			user = jdbcUtil.loginUser(userModel);
			if (user != null) {
				if (request.getParameter("password").equals(user.getPassword())) {
					user.setPassword(null);
					request.getSession().setAttribute("user", user);
					
					RequestDispatcher requestDispatcher = request .getRequestDispatcher(response.encodeRedirectURL("welcome.jsp"));
					requestDispatcher.forward(request, response);
				}else{
					request.setAttribute("passwordError", "Invalid password");
					RequestDispatcher requestDispatcher = request .getRequestDispatcher(response.encodeRedirectURL("login.jsp"));
					requestDispatcher.forward(request, response);
				}
			} else {
				request.setAttribute("usernameError", "Invalid UserName");
				RequestDispatcher requestDispatcher = request .getRequestDispatcher(response.encodeRedirectURL("login.jsp"));
				requestDispatcher.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
