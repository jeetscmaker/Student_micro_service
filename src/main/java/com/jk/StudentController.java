package com.jk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@ResponseBody
	@GetMapping("/getFullList")
	public List<Student> getFullList(){
		System.out.println("Inside Student Controller.........");
		return studentService.getFullList();
	}
}
