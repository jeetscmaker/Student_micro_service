package com.jk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentDao stDao;

    public List<Student> getFullList() {
        return stDao.getFullList().values().stream().collect(Collectors.toList());
    }
}
