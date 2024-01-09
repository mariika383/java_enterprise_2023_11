package com.hillel.multi.service.impl;

import com.hillel.multi.model.classes.Student;
import com.hillel.multi.model.repository.StudentRepository;
import com.hillel.multi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentById(Long studentId) {
        return null;
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        return null;
    }

    @Override
    public void deleteStudent(Long studentId) {

    }
}
