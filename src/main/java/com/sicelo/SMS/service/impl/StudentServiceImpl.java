package com.sicelo.SMS.service.impl;

import com.sicelo.SMS.entity.Student;
import com.sicelo.SMS.respository.StudentRepository;
import com.sicelo.SMS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    /*public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }*/

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student storedEmailDetails(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteAllById(Collections.singleton(id));
    }
}
