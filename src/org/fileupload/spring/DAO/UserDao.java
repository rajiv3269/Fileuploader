package org.fileupload.spring.DAO;

import org.fileupload.spring.Model.UserDetails;
import org.fileupload.spring.Model.ValidUser;

public interface UserDao {
	public int insertUser(UserDetails userdetails);
	public int deleteUser(UserDetails userdetails);
	public boolean checkValidity(ValidUser validuser);
}
