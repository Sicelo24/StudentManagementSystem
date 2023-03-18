package com.sicelo.SMS.service;

import com.sicelo.SMS.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student storedEmailDetails(String email);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

}
