package com.jda.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



	
	@Configuration
	@ComponentScan("com.jda")
	@EnableWebMvc
	public class SpringConfiguration {
	 
		@Bean
		public InternalResourceViewResolver resolver(){
		 InternalResourceViewResolver internalResourceviewResolver= new InternalResourceViewResolver();
		 internalResourceviewResolver.setPrefix("/WEB-INF/views/");
		 internalResourceviewResolver.setSuffix(".jsp");
		 return internalResourceviewResolver;
	 }
		
		@Bean
		public DataSource getDatasource(){
			DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
			driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			driverManagerDataSource.setUrl("jdbc:mysql://" + System.getenv("DBHOST") + ":3306/" + System.getenv("DBNAME"));
			driverManagerDataSource.setPassword(System.getenv("DBPASSWORD"));
			driverManagerDataSource.setUsername( System.getenv("DBUSER"));
			return driverManagerDataSource;
		}
		
		@Bean
		public BCryptPasswordEncoder passwordEncoder() {
		    return new BCryptPasswordEncoder();
		}
		
		@Bean
		public JavaMailSender getJavaMailSender(){
			JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
			javaMailSenderImpl.setHost("mtp.gmail.com");
			javaMailSenderImpl.setPort(587);
			javaMailSenderImpl.setUsername("try.java01@gmail.com");
			javaMailSenderImpl.setPassword("qwertyuiop!@#$%");
			Properties properties = javaMailSenderImpl.getJavaMailProperties();
			properties.put("mail.transport.protocol", "smtp");
			properties.put("mail.smtp.auth", true);
			properties.put("mail.smtp.starttls.enable", true);
			properties.put("mail.debug", true);
			
			return javaMailSenderImpl;
		}
		
	}