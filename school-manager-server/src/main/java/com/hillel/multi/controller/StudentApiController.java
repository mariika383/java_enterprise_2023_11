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
    public ResponseEntity<Void> studentsGet() {
        List<Student> students = studentService.getAllStudents();
        return (ResponseEntity<Void>) ResponseEntity.ok();
    }

    @Override
    public ResponseEntity<Void> studentsPost(Student student) {
        Student createdStudent = studentService.createStudent(student);
        return (ResponseEntity<Void>) ResponseEntity.ok();
    }
    @Override
    public ResponseEntity<Void> studentsStudentIdDelete(Long studentId) {
        studentService.deleteStudent(studentId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> studentsStudentIdGet(Long studentId) {
        Student student = studentService.getStudentById(studentId);
        if (student != null) {
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @Override
    public ResponseEntity<Void> studentsStudentIdPut(Long studentId, Student student) {
        student.setId(student.getId());
        studentService.updateStudent(studentId, student);
        return ResponseEntity.ok().build();
    }
}



