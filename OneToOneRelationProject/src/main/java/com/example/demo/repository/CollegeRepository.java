package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CollegeEntity;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeEntity, Integer> {

	List<CollegeEntity> findByStid(int id);
}
