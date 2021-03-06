package com.tyss.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpawithhibernateapp.dto.Product;

public class RetriveNameUsingJpql {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);
		List<String> query1 =  query.getResultList();
		for(String product : query1) {
			System.out.println(product);
		}
	}

}
