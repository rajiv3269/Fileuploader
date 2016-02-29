package org.fileupload.spring.DAO;

import java.util.List;

import org.fileupload.spring.Model.UserDetails;
import org.fileupload.spring.Model.ValidUser;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

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
	 session.save(userdetails);
	 return 1;
	}

	@Override
	public int deleteUser(UserDetails userdetails) {
		
		return 0;
	}

	@Override
	public boolean checkValidity(ValidUser validuser) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(UserDetails.class)
							.setProjection(Projections.projectionList()
							.add(Projections.property("email"),"email")
							.add(Projections.property("password"),"password"))
							.setResultTransformer(Transformers.aliasToBean(UserDetails.class));
		List<UserDetails> listvalid = criteria.list();		 			
		
		String email = validuser.getEmail();
		String password = validuser.getPassword();
		
		for(UserDetails list:listvalid){
			if(list.getEmail().equalsIgnoreCase(validuser.getEmail())&&list.getPassword().equals(validuser.getPassword())){
				return true;
			}
		}
		return false;
	}

}
