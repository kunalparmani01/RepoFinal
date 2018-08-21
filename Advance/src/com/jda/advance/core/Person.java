package com.jda.advance_core;

public class Person {
	public class Person {

		String firstname;
		String lastname;
		String address;
		String city;
		String state;
		String zip;
		String phone;
		
		public Person(	String firstname, String lastname, String address, String city, String state, String zip, String phone)
		{
			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phone = phone;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
	}


}
