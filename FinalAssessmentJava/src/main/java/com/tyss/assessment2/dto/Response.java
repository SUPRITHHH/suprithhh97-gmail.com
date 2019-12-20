package com.tyss.assessment2.dto;

import java.util.List;



public class Response {

	private int statusCode;
	private String message;
	private String description;
	private List<Products> products;
	private Order_Info order;
	private Products product;
	private List<Order_Info> order1;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public Order_Info getOrder() {
		return order;
	}
	public void setOrder(Order_Info order) {
		this.order = order;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public List<Order_Info> getOrder1() {
		return order1;
	}
	public void setOrder1(List<Order_Info> order1) {
		this.order1 = order1;
	}
	
	
	
}
