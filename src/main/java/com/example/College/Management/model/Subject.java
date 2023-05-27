package com.example.College.Management.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Subject {
	
	@Id
	private int sub_id;
	private String sname;
	


	@ManyToMany(mappedBy = "subjects",fetch = FetchType.LAZY)
	@JsonIgnore
	 List<Student>students;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacher_id",referencedColumnName = "tid")
	private Teacher teacher;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "marks_id",referencedColumnName = "id")
	private Marks marks;
	
	
//	@ManyToMany(mappedBy = "subject")
//	private List<Marks> marks;
//	 @OneToOne(targetEntity = Marks.class,cascade = CascadeType.ALL)
//	    private Marks marks;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
//    private List<Marks> marks;
	
     
//	@OneToMany(targetEntity = Marks.class,cascade = CascadeType.ALL)
//	private List<Marks> marks;
	

}
