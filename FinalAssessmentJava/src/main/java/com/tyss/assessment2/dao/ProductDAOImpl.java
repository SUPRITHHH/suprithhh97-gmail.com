package com.tyss.assessment2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.tyss.assessment2.dto.Order_Info;
import com.tyss.assessment2.dto.Products;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(Products products) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(products);
			transaction.commit();
			return true;
			}catch (Exception e) {
				e.printStackTrace();
				return false;
		}
		
	}

	@Override
	public boolean modifyProducts(Products products) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Products p = manager.find(Products.class, products.getProduct_id());
			p.setName(products.getName());
			p.setCategory(products.getCategory());
			p.setCompany(products.getCompany());
			p.setQuantity(products.getQuantity());
			p.setPrice(products.getPrice());
			transaction.commit();
			return true;
			}catch (Exception e) {
				e.printStackTrace();
				return false;
		}
	}

	@Override
	public List<Products> getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
			String jpql = "from Products where name=:name";
			TypedQuery<Products> typedQuery = manager.createQuery(jpql,Products.class);
			typedQuery.setParameter("name", name);
			return typedQuery.getResultList();
	}


	@Override
	public List<Products> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products where category=:category";
		TypedQuery<Products> typedQuery = manager.createQuery(jpql,Products.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

	@Override
	public List<Products> getProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products where company=:company";
		TypedQuery<Products> typedQuery = manager.createQuery(jpql,Products.class);
		typedQuery.setParameter("company", company);
		return typedQuery.getResultList();
	}

	@Override
	public boolean addProductToCart(Order_Info orderInfo) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(orderInfo);
			transaction.commit();
			return true;
			}catch (Exception e) {
				e.printStackTrace();
				return false;
		}
		
	}

	@Override
	public List<Order_Info> getOrderList() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Order_Info";
		TypedQuery<Order_Info> typedQuery = manager.createQuery(jpql,Order_Info.class);
		return typedQuery.getResultList();
	}

	
}
