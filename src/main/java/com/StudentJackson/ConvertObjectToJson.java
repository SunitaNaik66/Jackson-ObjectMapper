package com.StudentJackson;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjectToJson {
	public static void main(String[] args) throws Exception{
		Student s=new Student(100,"sunita","female","karnataka");
		Student s1=new Student(101,"min","male","chennai");
		Student s2=new Student(10103,"smitti","female","hydrabad");
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("student1.json"),s);
		mapper.writeValue(new File("student2.json"),s1);
		mapper.writeValue(new File("student3.json"),s2);
		System.out.println("completed.......");
		
	}
	

}
