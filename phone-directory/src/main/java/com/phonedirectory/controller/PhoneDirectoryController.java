package com.phonedirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonedirectory.model.PhoneBean;
import com.phonedirectory.service.PhoneDirectoryService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1")
public class PhoneDirectoryController {
	
	@Autowired
	PhoneDirectoryService phoneDirectoryService;
	
	/*
	 * @Description: Search Phone Owner name by input as partial customer Name.
	 * @Param : name
	 * @return: List<PhoneBean>
	 * */
	@GetMapping(value = "/name/{name}")
	public ResponseEntity<List<PhoneBean>> searchByNameAsKey(@PathVariable("name") String name){
		List<PhoneBean> list =  phoneDirectoryService.searchByNameAsKey(name);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	/*
	 * @Description: Get all the Phone number details existing in the Directory
	 * @return: List<PhoneBean>
	 * */
	@GetMapping(value = "/all")
	public ResponseEntity<List<PhoneBean>> getPhoneDetails(){
		List<PhoneBean> list =  phoneDirectoryService.getPhoneDetails();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	/*
	 * @Description: Bulk Addition of  Individual Phone number details
	 * @Param : List of phones as in Request body
	 * @return: Boolean
	 * */
	@PostMapping(value = "/phones")
	public ResponseEntity<Boolean> addPhones(@RequestBody List<PhoneBean> phones){
		Boolean result = phoneDirectoryService.doSave(phones);
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
}
