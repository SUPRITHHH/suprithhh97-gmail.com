package com.tyss.assetmanagement.util;

import com.tyss.assetmanagement.dao.UserDAO;
import com.tyss.assetmanagement.dao.UserDAOJdbcImpl;

public class UserDAOManager {

	private  UserDAOManager() {
		
	}

	public static UserDAO getUserDao() {
		return (UserDAO) new UserDAOJdbcImpl();

}
}