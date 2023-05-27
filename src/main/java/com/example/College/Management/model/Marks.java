package com.example.College.Management.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Marks {
	@Id
	private int id;
	 

	
//	
	//@ManyToOne(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "student_id")
//	    private Student student;

//	    @ManyToOne(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "subject_id")
//	    private Subject subject;
//	 
	   
	    private int marks;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	@ManyToOne
//	    @JoinColumn(name = "subject_id")
//	    private Subject subject;
//	 
//	 @ManyToOne
//	    @JoinColumn(name = "student_id")
//	    private Student student ;
//	 
//	 @OneToOne(cascade = CascadeType.ALL)
//	 @JoinColumn(name = "teacher_id")
//	 private Teacher teacher;
	 
	 
	 


	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
////	
////	 @ManyToOne
////	    @JoinColumn(name = "student_id")
////	    private Student student;
////
////	    @ManyToOne
////	    @JoinColumn(name = "sub_id")
////	    private Subject subject;
//	
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "student_id")
//    private Student student;
//    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "teacher_id")
//    private Teacher teacher;
////    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "subject_id")
//    private Subject subject;
  
    
	

}
