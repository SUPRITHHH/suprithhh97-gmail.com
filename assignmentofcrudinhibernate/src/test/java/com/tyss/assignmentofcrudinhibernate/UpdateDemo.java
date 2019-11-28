package com.tyss.assignmentofcrudinhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.assignmentofcrudinhibernate.dto.ProductOne;

public class UpdateDemo {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	    entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		ProductOne productDetail = entityManager.find(ProductOne.class, 101);
		productDetail.setPname("Pen");
		System.out.println("Record Updated");
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		

	}

}
