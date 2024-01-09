package com.hillel.multi.service;


import com.hillel.multi.model.classes.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student getStudentById(Long studentId);

    Student updateStudent(Long studentId, Student student);

    void deleteStudent(Long studentId);
    List<Student> getAllStudents();
}
