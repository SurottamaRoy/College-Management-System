package com.example.College.Management.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Teacher {
	@Id
	private int tid;
	private String tname;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@OneToOne(mappedBy = "teacher")
//	private Subject subject;
	
//	@OneToOne(mappedBy = "teacher",cascade = CascadeType.ALL)
//    //@JoinColumn(name = "sub_id", referencedColumnName = "tid")
//    private Subject subject;

}
