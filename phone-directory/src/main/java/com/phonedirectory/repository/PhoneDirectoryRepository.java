package com.phonedirectory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.phonedirectory.model.PhoneBean;

@Repository
public interface PhoneDirectoryRepository  extends JpaRepository<PhoneBean, Long> {
	
	@Query("SELECT num FROM PhoneBean num WHERE lower(num.ownerName) LIKE lower(concat('%', :name, '%'))")
	List<PhoneBean> searchByNameLike(@Param("name") String name);
	
}
