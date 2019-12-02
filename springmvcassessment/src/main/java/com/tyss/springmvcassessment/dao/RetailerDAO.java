package com.tyss.springmvcassessment.dao;

import com.tyss.springmvcassessment.beans.ProductBean;
import com.tyss.springmvcassessment.beans.RetailerBean;

public interface RetailerDAO {

	public RetailerBean login(int id,String password);
	public int register(RetailerBean bean);
	public ProductBean searchProduct(int id);
	public boolean updatePassword(int id,String password);
	
	
}
