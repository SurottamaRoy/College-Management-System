package com.example.College.Management.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	private int student_id;
	private String name;
	private String password;
//	
//	 @OneToMany(targetEntity = Marks.class,cascade = CascadeType.ALL)
//	    private List<Marks> marks;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Subject_Table",
	joinColumns = {
			@JoinColumn(name="student_id",referencedColumnName = "student_id")
	},
	
	inverseJoinColumns = {
			@JoinColumn(name="subject_id",referencedColumnName = "sub_id")
	}
			)
	
	private List<Subject> subjects;

//	public Integer getStudent_id() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	@ManyToMany(mappedBy = "student")
//	private List<Marks> marks;
	
	
//	@OneToMany(targetEntity = Marks.class,cascade = CascadeType.ALL)
//	private List<Marks> marks;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@OneToMany(targetEntity = Marks.class,cascade = CascadeType.ALL)
//	private List<Marks> marks;
	
//	 @OneToMany(targetEntity = Marks.class, cascade = CascadeType.ALL)
//	    private List<Marks> marks;

}
