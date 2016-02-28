package org.fileupload.spring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Valid_User")
public class ValidUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Vailid_UserId")
	private int validId;
	@NotEmpty(message = "Enter Email")
	@Column(name="Email",nullable=false,unique=true)
	private String email;
	@NotEmpty(message = "Enter Password")
	private String password;
	@OneToOne
	@JoinColumn(name="Master_UserId")
	private UserDetails userdetails;
	
	public UserDetails getUserdetails() {
		return userdetails;
	}
	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}
	public String getEmail() {
		return email;
	}
	public int getValidId() {
		return validId;
	}
	public void setValidId(int validId) {
		this.validId = validId;
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
	public ValidUser(int validId, String email, String password,
			UserDetails userdetails) {
		super();
		this.validId = validId;
		this.email = email;
		this.password = password;
		this.userdetails = userdetails;
	}
	public ValidUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ValidUser [validId=" + validId + ", email=" + email
				+ ", password=" + password + ", userdetails=" + userdetails
				+ "]";
	}

	
	
}
