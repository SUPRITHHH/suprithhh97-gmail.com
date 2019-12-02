package com.tyss.springmvcassessment.service;

import com.tyss.springmvcassessment.beans.ProductBean;
import com.tyss.springmvcassessment.beans.RetailerBean;

public interface RetailerService {

	public RetailerBean login(int id,String password);
	public int register(RetailerBean bean);
	public ProductBean searchProduct(int id);
	public boolean updatePassword(int id,String password);
}
