package com.hillel.multi.controller.api;

import com.hillel.multi.model.classes.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/students")
public interface StudentApi {
    @GetMapping
    ResponseEntity<List<Student>> getStudents();

    @PostMapping
    ResponseEntity<Student> createStudent(@Valid @RequestBody Student student);

    @GetMapping("/{studentId}")
    ResponseEntity<Student> getStudentById(@PathVariable("studentId") Long studentId);

    @PutMapping("/{studentId}")
    ResponseEntity<Student> updateStudent(@PathVariable("studentId") Long studentId, @Valid @RequestBody Student student);

    @DeleteMapping("/{studentId}")
    ResponseEntity<Void> deleteStudent(@PathVariable("studentId") Long studentId);
}
