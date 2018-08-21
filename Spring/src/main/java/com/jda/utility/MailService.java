package com.jda.utility;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailService {

	public void sendMail(String link) {
		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
		javaMailSenderImpl.setHost("smtp.gmail.com");
		javaMailSenderImpl.setPort(587);
		javaMailSenderImpl.setUsername("try.java01@gmail.com");
		javaMailSenderImpl.setPassword("qwertyuiop!@#$%");
		Properties properties = javaMailSenderImpl.getJavaMailProperties();
		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.debug", "true");

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo("kunalparmani01@gmail.com");
		simpleMailMessage.setSubject("Link to Reset Password");
		simpleMailMessage.setText("Click the link to reset password\n \n "+link);
		javaMailSenderImpl.send(simpleMailMessage);
		
	}

}
