package com.tyss.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpawithhibernateapp.onetoone.Person;
import com.tyss.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {
	 public static void main(String[] args) {
			
		  VoterCard vc = new VoterCard();
		   vc.setVid(1);
		   vc.setVname("Suprith");
		   
		  Person p = new Person();
		  p.setPid(1);
		  p.setName("Suprith");
		  p.setVotercard(vc);
		  
		  EntityManager entityManager = null ;
		  EntityTransaction entityTransaction = null;
			
			
			try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard = entityManager.find(VoterCard.class, 1);
			System.out.println(vCard.getPerson().getPid());
//			entityManager.persist(p);
			entityTransaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				entityTransaction.rollback();
			}
            	entityManager.close();
			
		
		
	}

}
