package com.example.College.Management.dao;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.College.Management.model.Marks;
import com.example.College.Management.model.Student;
import com.example.College.Management.model.Subject;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	Student findById(int studentId);
	
	Student findByname(String name);
	
	@Query(value = "select marks from student where name=?1 and sname=?2",nativeQuery = true)
	Student findmarksstudent(String name,String subname);
	

//	@Query(value = "select * from student where student_id=?1",nativeQuery = true)
//	List<Student> findAllStudents(int id);

	
//	@Query(value = "select * from student_subject_table where student_id=?1",nativeQuery = true)
//	List<Map<String, Object>> allStudentDetails(int id);
	
//	@Query(value = "select student.name, subject.marks from student join subject join marks on subject.mark_id=marks.id where student.student_id=?1",nativeQuery = true)
//	List<Student> allStudentDetails(int id);

}
