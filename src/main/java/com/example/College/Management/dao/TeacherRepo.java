package com.example.College.Management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.College.Management.model.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
	
//	@Query(value = "select * from teacher where tid=?1",nativeQuery = true)
//	List<Teacher> findTeacher()

}
