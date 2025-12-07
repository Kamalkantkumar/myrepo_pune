package com.technoelevate.phonebook.contacts;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contacts {
	@Id
	private long contact_num;
	private String contact_name;
	private String email_id;
	public Contacts(long contact_num, String contact_name, String email_id) {
		this.contact_num = contact_num;
		this.contact_name = contact_name;
		this.email_id = email_id;
	}
	public Contacts() {
		
	}
	public long getContact_num() {
		return contact_num;
	}
	public void setContact_num(long contact_num) {
		this.contact_num = contact_num;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	@Override
	public String toString() {
		return "Contacts list (contact_num=" + contact_num + ", contact_name=" + contact_name + ", email_id=" + email_id
				+ ")";
	}
	
	
	
	

}
