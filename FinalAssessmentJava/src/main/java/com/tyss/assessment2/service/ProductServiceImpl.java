package com.tyss.assessment2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.assessment2.dao.ProductDAO;
import com.tyss.assessment2.dto.Order_Info;
import com.tyss.assessment2.dto.Products;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO dao;

	@Override
	public boolean addProduct(Products products) {
		return dao.addProduct(products);
	}

	@Override
	public boolean modifyProducts(Products products) {
		return dao.modifyProducts(products);
	}

	@Override
	public List<Products>  getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public List<Products> getProductByCategory(String category) {
		return dao.getProductByCategory(category);
	}

	@Override
	public List<Products> getProductByCompany(String company) {
	    return dao.getProductByCompany(company);
	}

	@Override
	public boolean addProductToCart(Order_Info orderInfo) {
		return dao.addProductToCart(orderInfo);
	}

	@Override
	public List<Order_Info> getOrderList() {
		return dao.getOrderList();
	}
	
	
	
}
