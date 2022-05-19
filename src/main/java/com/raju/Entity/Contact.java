package com.raju.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="connect")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String Name;
	String email;
	String phono;
	boolean activeSw;
	public Contact() {
		super();
	}
	public Contact(int id, String name, String email, String phono, boolean activeSw) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
		this.phono = phono;
		this.activeSw = activeSw;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhono() {
		return phono;
	}
	public void setPhono(String phono) {
		this.phono = phono;
	}
	public boolean isActiveSw() {
		return activeSw;
	}
	public void setActiveSw(boolean activeSw) {
		this.activeSw = activeSw;
	}
	
	

}
