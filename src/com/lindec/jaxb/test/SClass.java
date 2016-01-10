package com.lindec.jaxb.test;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SClass{
	
	private String cnum;
	private List<Student> students;
	
	public SClass(){
		super();
	}
	
	public SClass(String cnum, List<Student> students){
		super();
		this.cnum = cnum;
		this.students = students;
	}
	
	
//	public void addStudent(Student student){
//		if(!this.students.contains(student)){
//			student.setSclass(this);
//			this.students.add(student);
//		}
//	}

	public String getCnum(){
		return cnum;
	}
	
	public void setCnum(String cnum){
		this.cnum = cnum;
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public void setStudents(List<Student> students){
		this.students = students;
	}	
	
}
