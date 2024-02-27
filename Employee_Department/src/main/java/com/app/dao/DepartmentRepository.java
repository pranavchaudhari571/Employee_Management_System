package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Department;

//DepartmentRepository.java
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
 // Additional queries if needed
}

