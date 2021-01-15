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

	@SuppressWarnings("unchecked")
	@Override
	public List<String> addPhoneNumber(PhoneBean phone) {

		PhoneBean bean = phoneDirectoryRepository.findByNumber(phone.getNumber());
		if (null != bean) {
			throw new BadRequestException("Duplicate entry (Phone Number) not allowed");
		}
		try {
			phoneDirectoryRepository.save(phone);
		} catch (Exception e) {
			throw new SQLException("Error while inserting into dabase table. Please contact Admin");
		}

		if (phone.getPid() > 0) {
			return this.getPhoneNumbers();
		}
		return Collections.EMPTY_LIST;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getPhoneNumbers() {
		List<PhoneBean> list = phoneDirectoryRepository.findAll();
		if (!list.isEmpty()) {
			return list.stream().map(PhoneBean::getNumber).collect(Collectors.toList());
		}
		return Collections.EMPTY_LIST;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> searchByKey(String key) {
		List<PhoneBean> list = phoneDirectoryRepository.searchByNumberLike(key);
		if (!list.isEmpty()) {
			return list.stream().map(PhoneBean::getNumber).collect(Collectors.toList());
		}
		return Collections.EMPTY_LIST;
	}

	@Override
	public PhoneBean findByNumber(String number) {
		PhoneBean phone = phoneDirectoryRepository.findByNumber(number);
		return phone;
	}
}
