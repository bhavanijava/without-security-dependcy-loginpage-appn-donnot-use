package com.web.service;

import com.web.model.Student;
import java.util.*;

public interface StudentService {
	
	public Student saveStu(Student s);
	public void deleteStu(Integer id);
	public Student getOneStu(Integer id);
	public List<Student> getAllStu();
	public Student updateStu(Student s,Integer id);
}
