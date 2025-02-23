package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.details;

public class DetailsDao {
	
	private static SessionFactory factory;
	
	static {
		try {
			factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertEmployee(details d) {
		Session session = factory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(d);
		beginTransaction.commit();
		session.close();
		
	}
	
	
	public List<details> fetchDetails(){
			Session openSession = factory.openSession();
			List<details> list = openSession.createQuery("from details",details.class).list();
			openSession.close();
			return list;
	}

}
