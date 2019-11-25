package com.testyantra.assesment.util;

import com.testyantra.assesment.dao.ContactDAO;
import com.testyantra.assesment.dao.ContactImpl;

public class ContactManger {

public static  ContactDAO getContactDAo() {
		
		return (ContactDAO) new ContactImpl();
	}
}
