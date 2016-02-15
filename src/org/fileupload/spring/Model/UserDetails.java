package org.fileupload.spring.Model;

import java.util.Date;

public class UserDetails {

	private int userId;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private Date created;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public UserDetails(int userId, String firstName, String lastName,
			String password,String email) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.created = new Date();
	}
	
	public UserDetails() {
		super();
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", password=" + password
				+ ", email=" + email + ", created=" + created + "]";
	}
	
	
}
