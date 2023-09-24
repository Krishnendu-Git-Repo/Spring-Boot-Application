package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Accounting;

@Repository
public interface AccountRepository extends JpaRepository<Accounting, Integer> {

	List<Accounting> findByIdIn(List<Integer> id);
	
//	@Query("select a from Accounting a where a.firstName like :key")
//	List<Accounting> findByFirstName(@Param("key")String keyword);
	@Query("SELECT accObj FROM Accounting accObj WHERE CONCAT(accObj.id,accObj.firstName,accObj.lastName,accObj.age) LIKE %?1%")
	public Page<Accounting>findAlls(String keyword,Pageable pageable);

	@Query("SELECT accObj FROM Accounting accObj WHERE CONCAT(accObj.id,accObj.firstName,accObj.lastName,accObj.age) LIKE %?1%")
	public Page<Accounting> findAllValue(String key, Pageable pageable);

	

	
	

	

}
