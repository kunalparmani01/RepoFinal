package com.jda.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jda.model.UserModel;
import com.jda.service.IUserService;

@Controller
public class UserController {

	@Autowired
	IUserService userService;

	@RequestMapping("/registrationform")
	public ModelAndView registrationform() {
		ModelAndView model = new ModelAndView("registration");
		return model;
	}

	@RequestMapping(value = "/welcome")
	public ModelAndView getwelcome(@ModelAttribute("UserModel") UserModel userModel) {

		return null;
	}

	@RequestMapping(value = "/forgotform")
	public ModelAndView forgotform() {
		ModelAndView model = new ModelAndView("forgot");
		return model;
	}

	@RequestMapping(value = "/register")
	public ModelAndView getRegister(@ModelAttribute("UserModel") UserModel userModel) {
		if (userService.registerUser(userModel))
			return new ModelAndView("login");
		return null;
	}

	@RequestMapping(value = "/login")
	public ModelAndView getLogin(@ModelAttribute("UserModel") UserModel userModel) {
		UserModel user = userService.loginUser(userModel);
		if (user != null) {
			System.out.println("namemmmm" + user.getFirstName() + user.getLastName() + user.getPhoneNumber());
			return new ModelAndView("welcome");
		}
		return null;
	}

	@RequestMapping(value = "/forgotpasswordform")
	public ModelAndView getForgotPasswordForm() {
		return new ModelAndView("forgot");
	}

	@RequestMapping(value = "/forgotpassword")
	public ModelAndView forgetpassword(@ModelAttribute("UserModel") UserModel userModel, HttpServletRequest request) {
		String requestUrl = request.getRequestURL().toString();
		boolean flag = userService.forgotPassword(userModel, requestUrl);
		return null;
	}

	@RequestMapping(value = "/resetpasswordform")
	public ModelAndView getResetPasswordForm() {
		return new ModelAndView("reset");
	}

	@RequestMapping(value = "/resetpassword", method=RequestMethod.POST)
	public ModelAndView resetPassword(@ModelAttribute("UserModel") UserModel userModel, HttpServletRequest request) {
		String requestUrl = request.getHeader("Referer");
		if (userService.resetPassword(requestUrl, userModel)) {
			return new ModelAndView("login");
		} else {
			return null;
		}
	}

}
