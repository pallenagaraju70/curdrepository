package com.raju.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.ConRepository.ConRepository;
import com.raju.Entity.Contact;

@Service
public class ConServiceImpl implements ContactService {
	
	@Autowired
	private ConRepository repo; 

	@Override
	public String upsert(Contact contact) {
		Contact save = repo.save(contact);
		return "Sucess";
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return repo.findAll();
	}

	@Override
	public Contact getContact(int id) {
		
		Optional<Contact> optionalentity = repo.findById(id);
		Contact contact=optionalentity.get();
		return contact;
	}

	@Override
	public String deleteContact(int id) {
	
		repo.deleteById(id);;
	
		return "Sucess";
	}

}
