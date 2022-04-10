package com.greatlearning.studentFest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.studentFest.entity.Student;
import com.greatlearning.studentFest.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student findById(int theId) {
		Student stud = studentRepository.findById(theId).get();
		return stud;
	}

	@Override
	public void save(Student stud) {
		studentRepository.save(stud);	
	}

	@Override
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);	
	}
}
