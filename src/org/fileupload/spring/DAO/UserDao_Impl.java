package org.fileupload.spring.DAO;

import org.fileupload.spring.Model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDao_Impl implements UserDao{
	
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int insertUser(UserDetails userdetails) {
		Session session = sessionFactory.openSession();
		return (int) session.save(userdetails);
		
	}

	@Override
	public int deleteUser(UserDetails userdetails) {
		
		return 0;
	}

}
