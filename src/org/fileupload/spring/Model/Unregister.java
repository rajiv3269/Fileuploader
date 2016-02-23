package org.fileupload.spring.Model;

import org.hibernate.validator.constraints.NotEmpty;

public class Unregister {

	@NotEmpty(message="Enter Email")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Unregister(String email) {
		super();
		this.email = email;
	}

	public Unregister() {
		super();
		
	}
	
	
}
