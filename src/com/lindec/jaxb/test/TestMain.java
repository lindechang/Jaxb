package com.lindec.jaxb.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMain {

	@Test
	public void test() {

		Student student = new Student();
		student.setName("lindec");
		student.setNum("001");
		//File file = new File("E:\\wordspace\\eclipse\\Jaxb-1\\xml\\lindec.xml");
		File file = new File("xml");

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			String mid = "ss";
			//jaxbMarshaller.marshal(student, file);

			jaxbMarshaller.marshal(student, new FileOutputStream(file.getAbsolutePath() + "/" + mid + ".xml"));

			System.out.println("path---:"+file.getAbsolutePath());
			jaxbMarshaller.marshal(student, System.out);

			//Student student2 = (Student) unmarshaller.unmarshal(file);
			Student student2 = (Student) unmarshaller.unmarshal(new FileInputStream(file.getAbsolutePath() + "/" + mid + ".xml"));
			System.out.println(student2.getName());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		Car car1 = new Car();
		car1.setBrand("BMW");
		car1.setValue(500000);
		Car car2 = new Car();
		car2.setBrand("Ford");
		car2.setValue(400000);
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		
		Person person = new Person();	
		person.setAge(25);
		person.setName("lindec");
		person.setCars(cars);
		
		File file = new File("xml");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			String mid = "car1";
			//jaxbMarshaller.marshal(student, file);

			jaxbMarshaller.marshal(car1, new FileOutputStream(file.getAbsolutePath() + "/" + mid + ".xml"));

			System.out.println("path---:"+file.getAbsolutePath());
			jaxbMarshaller.marshal(car1, System.out);

			//Student student2 = (Student) unmarshaller.unmarshal(file);
			Car read_car = (Car) unmarshaller.unmarshal(new FileInputStream(file.getAbsolutePath() + "/" + mid + ".xml"));
			System.out.println(read_car.getBrand());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test 
	public void test3(){
		Car car1 = new Car();
		car1.setBrand("BMW");
		car1.setValue(500000);
		Car car2 = new Car();
		car2.setBrand("Ford");
		car2.setValue(400000);
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		
		Person person = new Person();	
		person.setAge(25);
		person.setName("lindec");
		person.setCars(cars);
		
		File file = new File("xml");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			String mid = "person";
			//jaxbMarshaller.marshal(student, file);

			jaxbMarshaller.marshal(person, new FileOutputStream(file.getAbsolutePath() + "/" + mid + ".xml"));

			System.out.println("path---:"+file.getAbsolutePath());
			jaxbMarshaller.marshal(person, System.out);
			Person read_person = 
			(Person) unmarshaller.unmarshal(new FileInputStream(file.getAbsolutePath() + "/" + mid + ".xml"));
			
			System.out.println(read_person.getCars().get(1).getBrand());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
