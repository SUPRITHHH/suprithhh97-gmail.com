package com.tyss.assetmanagement.dao;

import com.tyss.assetmanagement.dto.UserInfo;


public interface UserDAO {

	public UserInfo auth(int userid ,String userpassword);
	
	public UserInfo searchUser(int userid);
	
}
