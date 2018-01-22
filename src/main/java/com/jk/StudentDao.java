package com.jk;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	private Map<Integer, Student> empMap = new HashMap<>();
	{
		Student e1 = new Student(1, "Student Ramesh", "ramesh@gmail.com", "9876543210");
		Student e2 = new Student(2, "Student Suresh", "suresh@gmail.com", "9999999999");
		Student e3 = new Student(3, "Student Somesh", "somesh@gmail.com", "8888888888");
		Student e4 = new Student(4, "Student Ganesh", "ganesh@gmail.com", "7777777777");
		empMap.put(e1.getRoll(), e1);
		empMap.put(e2.getRoll(), e2);
		empMap.put(e3.getRoll(), e3);
		empMap.put(e4.getRoll(), e4);
	}
	
	public Map<Integer, Student> getFullList(){
		return empMap;
	}

}
