package com.tyss.assignmentofcrudinhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.assignmentofcrudinhibernate.dto.ProductOne;

public class InsertDemo {

	public static void main(String[] args) {
		
		ProductOne  productOne = new ProductOne();
		productOne.setPid(102);
		productOne.setPname("Pencil");
		productOne.setQuantity(30);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(productOne);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();

	}

}
