package com.cts.model;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="course")
public class CourseBean implements Serializable{
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer course_Id;
	@Id
	private String course_Name;
	private String duration;
	private Integer fee;
	private Date startDate;
	private Integer capacity;
	private Integer availability;
	

	public Integer getAvailability() {
		return availability;
	}


	public void setAvailability(Integer availability) {
		this.availability = availability;
	}


	public CourseBean() {
		// TODO Auto-generated constructor stub
	}


	public Integer getCourse_Id() {
		return course_Id;
	}


	public void setCourse_Id(Integer course_Id) {
		this.course_Id = course_Id;
	}


	public String getCourse_Name() {
		return course_Name;
	}


	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public Integer getFee() {
		return fee;
	}


	public void setFee(Integer fee) {
		this.fee = fee;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Integer getCapacity() {
		return capacity;
	}


	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}


	public CourseBean(Integer course_Id, String course_Name, String duration, Integer fee, Date startDate,
			Integer capacity, Integer availability) {
		super();
		this.course_Id = course_Id;
		this.course_Name = course_Name;
		this.duration = duration;
		this.fee = fee;
		this.startDate = startDate;
		this.capacity = capacity;
		this.availability = availability;
	}


	
	
	
	
	
	
	
	
}
