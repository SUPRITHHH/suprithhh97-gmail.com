package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.manytoone.Pencil;
import com.tyss.jpawithhibernateapp.manytoone.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {
		PencilBox pencilBox = new PencilBox();
		pencilBox.setBid(1);
		pencilBox.setBname("Camlin");
		
		Pencil p = new Pencil();
		p.setPid(1);
		p.setColor("Red");
		p.setPencilBox(pencilBox);
		
		Pencil p1 = new Pencil();
		p1.setPid(2);
		p1.setColor("Black");
		p1.setPencilBox(pencilBox);
		
		
		EntityManager entityManager = null ;
		  EntityTransaction entityTransaction = null;
		  
		  try {
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(p);
			entityManager.persist(p1);
			System.out.println("Record Saved");
			entityTransaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				entityTransaction.rollback();
			}
            	entityManager.close();
			
	}
}
