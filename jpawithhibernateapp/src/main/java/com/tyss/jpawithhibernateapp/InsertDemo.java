package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {
		
		Product  product = new Product();
		product.setPid(101);
		product.setPname("Pencil");
		product.setQuantity(10);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();
	}
}
