package com.example.College.Management.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.College.Management.dao.MarksRepo;
import com.example.College.Management.dao.StudentRepo;
import com.example.College.Management.dao.SubjectRepo;
import com.example.College.Management.dao.TeacherRepo;
import com.example.College.Management.model.Marks;
import com.example.College.Management.model.Student;
import com.example.College.Management.model.Subject;
import com.example.College.Management.model.Teacher;

import ch.qos.logback.core.model.Model;

@Controller
public class HomeController {
	
	@Autowired
	StudentRepo repo1;
	
	@Autowired
	SubjectRepo repo2;
	
	@Autowired
	TeacherRepo repo3;
	
	@Autowired
	MarksRepo repo4;
	
//	@RequestMapping("/")
//	public String home() {
//		return "home.jsp";
//	}
//	
//    @RequestMapping("/addStudent")
//	public String addStudent(Student student) {
//		System.out.println("Student name:"+student.getName());
//		repo1.save(student);
//		return "home.jsp";
//		
//	}

	//Check Login Credentials
	
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String logins(@RequestBody Student student) {
        Student loginStudent = repo1.findById(student.getStudent_id());
        if (loginStudent != null && loginStudent.getPassword().equals(student.getPassword()) && loginStudent.getName().equals(student.getName())
        		) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
    
    
    //Save all the data for a student
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
	public Student addAll(@RequestBody Student student) {
		return repo1.save(student);
	}
    
    //Get the details of student
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    @ResponseBody
	public List<Student> getStudent(){
		return repo1.findAll();
	}
    
    //Get details of subject
    @RequestMapping(value = "/subject",method = RequestMethod.GET)
    @ResponseBody
	public List<Subject> getSubjects(){
		return repo2.findAll();
	}
   
    //Get details of teacher
    @RequestMapping(value = "/teacher",method = RequestMethod.GET)
    @ResponseBody
	public List<Teacher> getTeacher(){
		return repo3.findAll();
	}
    
    //Get details of any particular subject
    @RequestMapping(value = "/getDetails/{id}",method = RequestMethod.GET)
    @ResponseBody
  public Optional<Subject> details(@PathVariable int id){
    	return repo2.findById(id);
    }
    
    //Get Details of any particular student
    
    @RequestMapping(value = "/getStudent/{id}",method = RequestMethod.GET)
    @ResponseBody
  public Student detailOfStudents(@PathVariable int id){
    	return repo1.findById(id);
    }
    
    @RequestMapping(value = "/findstudent/{name}",method = RequestMethod.GET)
    @ResponseBody
  public Student detailOfStudentsMark(@PathVariable String name){
    	return repo1.findByname(name);
    }
    
   
    
    //Get Details of any particular teacher
    
    @RequestMapping(value = "/getTeacher/{id}",method = RequestMethod.GET)
    @ResponseBody
  public Optional<Teacher> detailOfTeachers(@PathVariable int id){
    	return repo3.findById(id);
    }
    
//    @RequestMapping(value = "/addmarks",method = RequestMethod.POST)
//    @ResponseBody
//	public Marks addMarks(@RequestBody Marks marks) {
//		return repo4.save(marks);
//	}
    
//    @RequestMapping(value = "/marks",method = RequestMethod.GET)
//    @ResponseBody
//    public List<Map<String, Object>> allMarks(){
//    	return repo4.findAllMarks();
//    	
//    }
    
//    @RequestMapping(value = "/getmarks/{id}",method = RequestMethod.GET)
//    @ResponseBody
//    public List<Map<String, Object>>  allMarksStudent(@PathVariable int id){
//    	return repo2.allStudentDetails(id);
//    	
//    }
//    
//    @RequestMapping(value = "/addmark",method = RequestMethod.POST)
//    @ResponseBody
//	public Marks addMark(@RequestBody Marks marks) {
//		return repo4.save(marks);
//	}

    
    
    

    @RequestMapping(value = "/marks",method = RequestMethod.POST)
    //@PostMapping
    @ResponseBody
    public ResponseEntity<String> addMark(@RequestParam String name,
            @RequestParam String sname ,
            @RequestParam int marksObtained) {
         Student student = new Student();
         Subject subject = new Subject();
       
        Marks mark = new Marks();
        //mark.setStudent(student);
        //mark.setSubject(subject);
        mark.setMarks(marksObtained);
       repo4.save(mark);
          return ResponseEntity.ok("Mark added successfully");
        }
    
//    @RequestMapping(value = "getStudentmark/{id}",method = RequestMethod.GET)
//    @ResponseBody
//    public List<Marks> findmark(@PathVariable int id){
//    	return repo4.findMarksByStudentIdWithNames(id);
//    }
    }

    
   
    
  
       
	


