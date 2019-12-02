package com.tyss.springmvcassessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.springmvcassessment.beans.ProductBean;
import com.tyss.springmvcassessment.beans.RetailerBean;
import com.tyss.springmvcassessment.dao.RetailerDAO;



@Service
public class RetailerServiceImpl implements RetailerService{

	@Autowired
	private RetailerDAO dao;

	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(RetailerBean bean) {
		// TODO Auto-generated method stub
		return dao.register(bean);
	}

	@Override
	public ProductBean searchProduct(int id) {
		return dao.searchProduct(id);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		return dao.updatePassword(id, password);
	}
	
	
	
}
