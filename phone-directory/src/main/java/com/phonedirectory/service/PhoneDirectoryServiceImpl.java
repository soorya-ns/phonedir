package com.phonedirectory.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonedirectory.exception.BadRequestException;
import com.phonedirectory.exception.SQLException;
import com.phonedirectory.model.PhoneBean;
import com.phonedirectory.repository.PhoneDirectoryRepository;

@Service
public class PhoneDirectoryServiceImpl implements PhoneDirectoryService {

	@Autowired
	PhoneDirectoryRepository phoneDirectoryRepository;

	@Override
	public List<String> addPhoneNumber(PhoneBean phone) {

		PhoneBean bean = findByNumber(phone.getNumber());
		if (null != bean) {
			throw new BadRequestException("Duplicate entry (Phone Number) not allowed");
		}
		try {
			phoneDirectoryRepository.save(phone);
		} catch (Exception e) {
			throw new SQLException("Error while inserting into dabase table. Please contact Admin");
		}

		return this.getPhoneNumbers();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getPhoneNumbers() {
		List<String> list = phoneDirectoryRepository.findAll();
		if (!list.isEmpty()) {
			return list;
		}
		return Collections.EMPTY_LIST;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> searchByKey(String key) {
		List<String> list = phoneDirectoryRepository.findAll();
		if (!list.isEmpty()) {
			return list.stream().filter(x -> x.contains(key) ).collect(Collectors.toList());
		}
		return Collections.EMPTY_LIST;
	}

	@Override
	public PhoneBean findByNumber(String number) {
		PhoneBean bean = null;
		List<String> list = phoneDirectoryRepository.findAll();
		if (!list.isEmpty()) {
			list =  list.stream().filter(x -> x.equals(number) ).collect(Collectors.toList());
			if(!list.isEmpty() && list.size() ==1) {
			bean = new PhoneBean();
			bean.setNumber(list.get(0));
			}
			return bean;
		}
		return bean;
	}
}
