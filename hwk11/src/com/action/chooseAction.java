package com.action;

import java.util.Map;

import com.dao.CourseDao;
import com.model.Course;
import com.model.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class chooseAction extends ActionSupport{
	Student student;
	Course course;
	CourseDao CS = new CourseDao();
	Map session = ActionContext.getContext().getSession();
	
	public String execute() throws Exception{
		System.out.println(student.getName());
		System.out.println(course.getName());
		CS.addCourse(student, course);
		return "success";
	}

	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	

	
	
}
