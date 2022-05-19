package com.raju.ConRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raju.Entity.Contact;

public interface ConRepository extends JpaRepository<Contact, Integer> {

}
