package com.phonedirectory.service;

import java.util.List;

import com.phonedirectory.model.PhoneBean;

public interface PhoneDirectoryService {
	
    List<String> addPhoneNumber(PhoneBean phone);

    List<String> getPhoneNumbers();

    List<String> searchByKey(String key);

	PhoneBean findByNumber(String number);

}
