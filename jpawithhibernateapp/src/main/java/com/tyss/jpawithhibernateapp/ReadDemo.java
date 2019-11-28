package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetail = entityManager.find(Product.class, 101);
		System.out.println("ID-----"+productDetail.getPid());
		System.out.println("Name----"+productDetail.getPname());
		System.out.println("Quantity----"+productDetail.getQuantity());
	}//end of main()
}//end of class
