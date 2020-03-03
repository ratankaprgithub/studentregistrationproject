package com.cts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.model.CourseBean;

public interface CourseDao extends JpaRepository<CourseBean,String>{
	
	@Query("select c.course_Name from CourseBean c")
	public List<String> findAllCurseNames();
}
