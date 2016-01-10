package com.lindec.jaxb.test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student{
	
	private String num;
	private String name;

	//private SClass sclass;


	public Student(){
		super();
	}
	
	public Student(String num, String name){
		super();
		this.num = num;
		this.name = name;
	}
	
//	public SClass getSclass() {
//		return sclass;
//	}
//
//	@XmlElement
//	public void setSclass(SClass sclass) {
//		this.sclass = sclass;
//	}
	
	public String getNum(){
		return num;
	}
	
	@XmlElement
	public void setNum(String num){
		this.num = num;
	}
	
	public String getName(){
		return name;
	}
	
	@XmlElement
	public void setName(String name){
		this.name = name;
	}

}
