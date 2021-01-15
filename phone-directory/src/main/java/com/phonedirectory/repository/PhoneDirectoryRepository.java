package com.phonedirectory.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.phonedirectory.model.PhoneBean;
import com.phonedirectory.util.PhoneNumberDirecory;

@Component
public class PhoneDirectoryRepository {
	
	@Autowired
	PhoneNumberDirecory phoneNumberDirecory;
	
	public List<String> searchByNumberLike(String number){
		List<String> allList = findAll();
		List<String> filteredList = allList.stream().filter(x -> x.contains(number)).collect(Collectors.toList());
		return filteredList;
	}
	
	public List<String> save(PhoneBean phone){
		phoneNumberDirecory.addNumber(phone.getNumber());
		return findAll();
	}
	
	public List<String> findAll(){
		return phoneNumberDirecory.findAll();
	}
	

}
