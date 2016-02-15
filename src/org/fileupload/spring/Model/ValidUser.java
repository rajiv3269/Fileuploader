package org.fileupload.spring.Model;

import org.hibernate.validator.constraints.NotEmpty;

public class ValidUser {
	
	@NotEmpty(message = "Enter Email")
	private String email;
	@NotEmpty(message = "Enter Password")
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ValidUser(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public ValidUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ValidUser [email=" + email + ", password=" + password + "]";
	}
	
	
}
