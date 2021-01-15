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

import com.phonedirectory.exception.BadRequestException;
import com.phonedirectory.model.PhoneBean;
import com.phonedirectory.service.PhoneDirectoryService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1")
public class PhoneDirectoryController {
	
	@Autowired
	PhoneDirectoryService phoneDirectoryService;
	
	@GetMapping(value = "/phone/{number}")
	public ResponseEntity<List<String>> searchByKey(@PathVariable("number") String number){
		List<String> list =  phoneDirectoryService.searchByKey(number);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/phone")
	public ResponseEntity<List<String>> getAllNumbers(){
		List<String> list =  phoneDirectoryService.getPhoneNumbers();
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/phone")
	public ResponseEntity<List<String>> addNumber(@RequestBody PhoneBean phone){
		if (null != phone && null != phone.getNumber() && phone.getNumber().length()!=10) {
			throw new BadRequestException("Phone Number must be 10 digit length");
		}
		List<String> list  = phoneDirectoryService.addPhoneNumber(phone);
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}

	
	@GetMapping(value = "/healthcheck")
	public ResponseEntity<String> healthCheck(){
		return new ResponseEntity<>(String.valueOf(Boolean.TRUE), HttpStatus.OK);
		
	}
}
