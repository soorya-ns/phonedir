package com.phonedirectory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.phonedirectory.exception.BadRequestException;
import com.phonedirectory.exception.NoDataFoundException;
import com.phonedirectory.exception.DatabaseSQLException;
import com.phonedirectory.model.PhoneBean;
import com.phonedirectory.repository.PhoneDirectoryRepository;

@Service
public class PhoneDirectoryServiceImpl implements PhoneDirectoryService {

	@Autowired
	PhoneDirectoryRepository phoneDirectoryRepository;

	/*
	 * Description: Search list of phone details for key*
	 * @Param: 
	 * @Return List<PhoneBean>
	 */
	@Override
	public List<PhoneBean> searchByNameAsKey(String key) {
		if(!StringUtils.hasText(key)) {
			throw new BadRequestException("Invaid input data. Please update your request");
		}
		List<PhoneBean> list =  phoneDirectoryRepository.searchByNameLike(key);
		if(list.isEmpty()) {
		throw new NoDataFoundException("For this Search critiria no data available in the Phone directory to display");
		}
		return list;
	}
	
	
	/*
	 * Description: To Get All Phone details in the directory*
	 * @Param: 
	 * @Return List<PhoneBean>
	 */
	@Override
	public List<PhoneBean> getPhoneDetails() {
		List<PhoneBean> list =  phoneDirectoryRepository.findAll();
		if(list.isEmpty()) {
			throw new NoDataFoundException("No data available in the Phone directory to display");
		}
		return list;
	}

	/*
	 * Description: To Save Intial Data into database*
	 * @Param: phones
	 * @Return Boolean
	 */
	@Override
	public Boolean doSave(List<PhoneBean> phones) {
		if(phones.isEmpty()) {
			throw new BadRequestException("Empty data in the request. Please update your request");
		}
		try {
			phoneDirectoryRepository.saveAll(phones);
		} catch (Exception e) {
			throw new DatabaseSQLException("Failed to save your data. Please veryfy the request.` ", e.getMessage()+" ; "+e.getCause());
		}
		return Boolean.TRUE;
	}
}
