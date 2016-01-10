package com.lindec.jaxb.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car {

	 private String brand;
	 private double value;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	 
	 
}
