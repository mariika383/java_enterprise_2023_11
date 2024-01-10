package com.hillel.multi.service;


import com.hillel.multi.model.classes.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Long studentId, Student student);

    void deleteStudent(Long id);
    List<Student> getAllStudents();
}
