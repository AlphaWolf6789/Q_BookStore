package haui.qstore.service;

import java.util.List;


import haui.qstore.entity.Contact;
import haui.qstore.model.ContactModel;

public interface ContactService {
	ContactModel createContact(ContactModel contactModel);

	List<Contact> getListContactPending();

	Contact getContactByContactId(Integer id);

	void approveContact(Integer id);

	void delete(Integer id);

	List<Contact> getListContactChecked();
	
	List<Contact> findAll();
}
