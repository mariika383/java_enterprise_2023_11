package com.hillel.multi.controller;

import com.hillel.api.StudentApi;
import com.hillel.model.Student;
import com.hillel.multi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentApiController implements StudentApi {
    @Autowired
    private StudentService studentService;
    @Override
    public ResponseEntity<List<Student>> studentsGet() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);    }

    @Override
    public ResponseEntity<Student> studentsStudentIdGet(Long studentId) {
        Student student = studentService.getStudentById(studentId);
        return ResponseEntity.ok(student);
    }

    @Override
    public ResponseEntity<Void> studentsStudentIdPut(Long studentId, Student student) {
        student.setId(student.getId());
        studentService.updateStudent(studentId, student);
        return ResponseEntity.ok().build();    }

    @Override
    public ResponseEntity<Void> studentsStudentIdDelete(Long studentId) {
        studentService.deleteStudent(studentId);
        return ResponseEntity.ok().build();    }

    @Override
    public ResponseEntity<Student> studentsPost(Student student) {
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity.ok(createdStudent);    }
}
