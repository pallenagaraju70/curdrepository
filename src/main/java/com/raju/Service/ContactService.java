package com.raju.Service;

import java.util.List;

import com.raju.Entity.Contact;


public interface ContactService {
	
	String upsert(Contact contact);
	
	List<Contact>getAllContacts();
	
	Contact getContact(int id);
	
	String deleteContact(int id);

}
