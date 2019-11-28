package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.dto.Product;

public class GetReference {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		 Product product = entityManager.getReference(Product.class, 101);
		 
		 //Product product = entityManager.find(Product.class, 101);
		 System.out.println(product.getClass());
		 
		/* System.out.println("Id----> "+product.getPid());
		 System.out.println("Name---> "+product.getPname());
		 System.out.println("Quantity---> "+product.getQuantity());*/
		 
		 entityManager.close();
	}
	
	
}
