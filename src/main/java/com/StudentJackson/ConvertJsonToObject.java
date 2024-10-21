package com.StudentJackson;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsonToObject {
	public static void main(String[] args) throws Exception {
		File f=new File("student1.json");
		ObjectMapper mapper=new ObjectMapper();
		Student student = mapper.readValue(f, Student.class);
		System.out.println(student);
		
	}

}
