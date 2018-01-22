package com.jk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentDao stDao;
	
	public List<Student> getFullList() {
		List<Student> list = new ArrayList<>();
		Map<Integer, Student> map = stDao.getFullList();
		for(Student s: map.values()){
			list.add(s);
		}
		return list;
	}
}
