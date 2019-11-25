package com.testyantra.assesment.dao;

import java.util.List;

import com.testyantra.assesment.dto.ContactInfo;
import com.testyantra.assesment.util.ContactManger;

public interface ContactDAO {

	public int insertContact(ContactInfo info);
	public int updateContact(ContactInfo info);
	public int deleteContact(String name);
	public List<ContactInfo> getAllContacts();
	public  ContactInfo searchContact(String name);
}

