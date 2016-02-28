package org.fileupload.spring.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Main_User")
public class UserDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_Id",nullable=false)
	private int userId;
	@NotEmpty(message = "Enter Name")
	@Column(name="Name")
	private String firstName;
	@Column(name="Password",nullable=false)
	@NotEmpty(message = "Enter Password")
	private String password;
	@NotEmpty(message = "Enter Email")
	@Column(name="Email",nullable=false,unique=true)
	private String email;
	@OneToOne(mappedBy="userdetails")
	private ValidUser validuser;
	
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
	public ValidUser getValiduser() {
		return validuser;
	}
	public void setValiduser(ValidUser validuser) {
		this.validuser = validuser;
	}
	public UserDetails(int userId, String firstName, String password,
			String email, ValidUser validuser, Date created) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.password = password;
		this.email = email;
		this.validuser = validuser;
		this.created = created;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", firstName=" + firstName
				+ ", password=" + password + ", email=" + email
				+ ", validuser=" + validuser + ", created=" + created + "]";
	}

	
	
	
	
}
