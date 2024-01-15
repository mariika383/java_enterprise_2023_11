package com.hillel.multi.controller;

import com.hillel.multi.model.classes.Grade;

import com.hillel.multi.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/grade")
public class GradeController {
    private final GradeService gradeService;
    @GetMapping
    public ResponseEntity<List<Grade>> getAllGrades() {
        List<Grade> students = gradeService.getAllGrades();
        return ResponseEntity.ok(students);
    }
    @PostMapping
    public ResponseEntity<Grade> createGrade(@RequestBody Grade grade) {
        Grade createGrade = gradeService.createGrade(grade);
        return ResponseEntity.ok(createGrade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grade> getGradeById(@PathVariable Long id) {
        Grade grade = gradeService.getGradeById(id);
        return ResponseEntity.ok(grade);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Grade> updateGrade(@PathVariable Long id, Grade grade) {
        Grade updateGrade = gradeService.updateGrade(grade, id);
        return ResponseEntity.ok(updateGrade);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrade(@PathVariable Long id) {
        gradeService.deleteGrade(id);
        return ResponseEntity.noContent().build();
    }
}
