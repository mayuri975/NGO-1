package com.ngo.dao;




import org.apache.catalina.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao  {

	private SessionFactory sessionFactory;
	
	@Autowired
		public void AddUser(User u) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		
	}

	
}
