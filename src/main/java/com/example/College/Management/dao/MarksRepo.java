package com.example.College.Management.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.College.Management.model.Marks;
import com.example.College.Management.model.Student;
import com.example.College.Management.model.Subject;

public interface MarksRepo extends JpaRepository<Marks, Integer> {
	
	
//	@Query(value = "select s.name,sub.sname,m.marks,t.tname from Marks as m join student as s join subject as sub join teacher as t",nativeQuery = true)
//	List<Map<String, Object>> findAllMarks();
	
	//List<Marks> findByMarks(int mark);
	
	

}
