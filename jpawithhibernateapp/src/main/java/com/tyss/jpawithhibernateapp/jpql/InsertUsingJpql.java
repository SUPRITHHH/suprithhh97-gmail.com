package com.tyss.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertUsingJpql {

	public static void main(String[] args) {
		
		EntityManager entityManager = null ;
		EntityTransaction entityTransaction = null;
		
		
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "insert into Product (pid,pname,quantity) values (102,'Earphone',30)";
		Query query = entityManager.createNativeQuery(jpql);
	
//		query.setParameter("id", 102);
//		query.setParameter("name", "EarPhone");
//		query.setParameter("pquantity", 30);
		
		
		int result = query.executeUpdate();
		System.out.println(result);
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
	entityManager.close();
		
	}
	
	
	
}
