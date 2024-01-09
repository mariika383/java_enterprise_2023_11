package com.hillel.multi.controller;

import com.hillel.multi.controller.api.StudentApi;
import com.hillel.multi.model.classes.Student;
import com.hillel.multi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/student")
public class StudentController implements StudentApi {
    private final StudentService studentService;

    @Override
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @Override
    public ResponseEntity<Student> createStudent(Student student) {
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity.ok(createdStudent);
    }

    @Override
    public ResponseEntity<Student> getStudentById(Long studentId) {
        Student student = studentService.getStudentById(studentId);
        return ResponseEntity.ok(student);
    }

    @Override
    public ResponseEntity<Student> updateStudent(Long studentId, Student student) {
        Student updatedStudent = studentService.updateStudent(studentId, student);
        return ResponseEntity.ok(updatedStudent);
    }

    @Override
    public ResponseEntity<Void> deleteStudent(Long studentId) {
        studentService.deleteStudent(studentId);
        return ResponseEntity.noContent().build();
    }
}
