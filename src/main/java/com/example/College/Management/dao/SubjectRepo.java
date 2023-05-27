package com.example.College.Management.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.College.Management.model.Student;
import com.example.College.Management.model.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Integer> {
	
	
//	@Query(value = "select * from student join subject on student.id=subject.id where name=?1 and password=?2",nativeQuery = true)
//	List<Subject> findAllDetails(String name,String password);
	
	
//	@Query(value = "select * from subject where sub_id=?1",nativeQuery = true)
//	List<Subject> findAllDetails(int id);
	
	
	
//	@Query(value = "select * from subject as sub  where student_id=?1",nativeQuery = true)
//	List<Subject> allStudentDetails(int id);
	
//	@Query(value = "select * from subject  join marks as m join student  where student.student_id=?1",nativeQuery = true)
//	Map<String, Object> allStudentDetails(int id);
	
	@Query(value = "select * from student_subject_table where student_id=?1",nativeQuery = true)
	List<Map<String, Object>> allStudentDetails(int id);

	
}
