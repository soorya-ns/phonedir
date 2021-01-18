package com.phonedirectory.service;

import java.util.List;

import com.phonedirectory.model.PhoneBean;

public interface PhoneDirectoryService {
	
    List<PhoneBean> getPhoneDetails();

	List<PhoneBean> searchByNameAsKey(String key);
	
	Boolean doSave(List<PhoneBean> phones);

}
