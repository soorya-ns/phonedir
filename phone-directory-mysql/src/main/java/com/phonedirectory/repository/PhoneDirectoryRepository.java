package com.phonedirectory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.phonedirectory.model.PhoneBean;

@Repository
public interface PhoneDirectoryRepository  extends JpaRepository<PhoneBean, Long> {
	
	PhoneBean findByNumber(String number);
	
	@Query("SELECT num FROM PhoneBean num WHERE num.number LIKE %:number%")
	List<PhoneBean> searchByNumberLike(@Param("number") String number);

}
