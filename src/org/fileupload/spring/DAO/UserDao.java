package org.fileupload.spring.DAO;

import org.fileupload.spring.Model.UserDetails;

public interface UserDao {
	public int insertUser(UserDetails userdetails);
	public int deleteUser(UserDetails userdetails);
}
