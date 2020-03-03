package com.cts.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.dao.CourseDao;
import com.cts.model.CourseBean;

@Controller
public class CourseController {

@Autowired
CourseDao cdao;	


@ModelAttribute("courses")
public List<String> getCourses(){
	
	List<String> clist=new ArrayList<String>();
	
	clist=cdao.findAllCurseNames();
	
	return clist;
	
}





	
	@GetMapping("/addCourse")
	public String addNewCourse(@ModelAttribute("course")CourseBean course) {
			
		return "newCourse";
		
	}
	
	@PostMapping("/createCourse")
	public String createCourse(CourseBean course,Model m) {

		course.setAvailability(course.getCapacity());
		CourseBean c= cdao.save(course);
		
		m.addAttribute("id", c.getCourse_Id());
		
		System.out.println("sfsff"+c.getCourse_Id());
		System.out.println("sfsff"+c.getCourse_Name());
		
		
		return "courseSucess";
	}
	
	
	@GetMapping("/getACourse")
	public String getACourse() {
		
		return "getCourse";
	}
	
	
	@GetMapping("/getCourseDetails")
	public String getCourseDetails(String cname,Model m) {
		
		Optional<CourseBean> opt=cdao.findById(cname);
		
		if(opt.isPresent()) {
			
			CourseBean course=opt.get();
			
			m.addAttribute("course", course);
			
		}
		
		
		return "courseDetails";
		
	}
	
	
	
	
	
	
}
