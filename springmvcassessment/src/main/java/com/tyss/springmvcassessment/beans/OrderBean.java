package com.tyss.springmvcassessment.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class OrderBean {

	@Id
	@Column
	@GeneratedValue
	private int orderid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pid",nullable=false)
	private  List<ProductBean> productbean;
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id",nullable=false)
	private  List<RetailerBean> retailerbean;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public List<ProductBean> getProductbean() {
		return productbean;
	}
	public void setProductbean(List<ProductBean> productbean) {
		this.productbean = productbean;
	}
	public List<RetailerBean> getRetailerbean() {
		return retailerbean;
	}
	public void setRetailerbean(List<RetailerBean> retailerbean) {
		this.retailerbean = retailerbean;
	}
	
	
	
}
