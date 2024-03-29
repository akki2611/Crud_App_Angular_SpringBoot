package com.example.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUD.model.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long>{
	
}
