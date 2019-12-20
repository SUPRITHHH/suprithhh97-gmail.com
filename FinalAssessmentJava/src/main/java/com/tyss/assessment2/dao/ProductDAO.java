package com.tyss.assessment2.dao;

import java.util.List;

import com.tyss.assessment2.dto.Order_Info;
import com.tyss.assessment2.dto.Products;


public interface ProductDAO {

	public boolean addProduct(Products products);
	public boolean modifyProducts(Products products);
	public List<Products> getProductByName(String name);
	public List<Products> getProductByCategory(String category);
	public List<Products> getProductByCompany(String company);
	public boolean addProductToCart(Order_Info orderInfo);
	public List<Order_Info> getOrderList();
	
}
