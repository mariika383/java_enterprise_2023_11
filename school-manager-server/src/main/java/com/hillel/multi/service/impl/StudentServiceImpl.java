package com.hillel.multi.service.impl;

import com.hillel.model.Student;
import com.hillel.multi.repository.StudentRepository;
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
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }
}
