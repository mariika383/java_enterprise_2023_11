package com.hillel.api_controller;

import com.hillel.api.StudentsApi;
import com.hillel.model.Student;
import com.hillel.multi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentApiController implements StudentsApi {
    private final StudentService studentService;
    @Override
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @Override
    public ResponseEntity<Student> createStudent(Student student) {
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity.ok(createdStudent);
    }

    @Override
    public ResponseEntity<Void> deleteStudent(Long studentId) {
        studentService.deleteStudent(studentId);
        return ResponseEntity.noContent().build();
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
}
