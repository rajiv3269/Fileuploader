package org.fileupload.spring.Model;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class UserDetails {

	/*@NotEmpty
	private int userId;*/
	@NotEmpty(message = "Enter Name")
	private String firstName;
	@NotEmpty(message = "Enter Password")
	private String password;
	@NotEmpty(message = "Enter Email")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private Date created;
	
	/*public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}*/

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public UserDetails(/*int userId, */String firstName,
			String password,String email) {
		super();
		//this.userId = userId;
		this.firstName = firstName;
		this.password = password;
		this.email = email;
		this.created = new Date();
	}
	
	public UserDetails() {
		super();
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" /*+ userId */+ ", firstName=" + firstName
				 + ", password=" + password
				+ ", email=" + email + ", created=" + created + "]";
	}
	
	
}
