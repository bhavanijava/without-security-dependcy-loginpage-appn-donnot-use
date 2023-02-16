package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Student;
import com.web.repo.StudentRepo;

@Service
public class StudentServiceimp implements StudentService {
	@Autowired
	private StudentRepo repo;

	@Override
	public Student saveStu(Student s) {
		return repo.save(s);
	}

	@Override
	public void deleteStu(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Student getOneStu(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Student> getAllStu() {
		return (List<Student>) repo.findAll();
	}

	@Override
	public Student updateStu(Student s, Integer id) {
		return null;
	}

}
