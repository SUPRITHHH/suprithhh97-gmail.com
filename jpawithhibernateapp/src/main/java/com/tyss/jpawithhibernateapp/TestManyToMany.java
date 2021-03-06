package com.tyss.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernateapp.manytomany.Course;
import com.tyss.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {
		
		Course course = new Course();
		course.setCid(1);
		course.setCname("Java");
		
		Course course1 = new Course();
		course1.setCid(2);
		course1.setCname("SQL");
		
		Course course2 = new Course();
		course2.setCid(3);
		course2.setCname("JDBC");
		
		ArrayList<Course> a = new ArrayList<Course>();
		a.add(course);
		a.add(course1);
		a.add(course2);
		
		Student student = new Student();
		student.setSid(1);
		student.setSname("Suprith");
		student.setCourses(a);
		
		
		
		
		
		EntityManager entityManager = null ;
		  EntityTransaction entityTransaction = null;
		  
		  try {
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			
			
			System.out.println("Record Saved");
			entityTransaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				entityTransaction.rollback();
			}
          	entityManager.close();
			
	}

	}


