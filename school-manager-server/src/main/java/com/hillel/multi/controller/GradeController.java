package com.hillel.multi.controller;

import com.hillel.multi.controller.api.GradeApi;
import com.hillel.multi.model.classes.Grade;

import com.hillel.multi.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/grade")
public class GradeController implements GradeApi {
    private final GradeService gradeService;

    @Override
    public ResponseEntity<List<Grade>> getAllGrades() {
        List<Grade> students = gradeService.getAllGrades();
        return ResponseEntity.ok(students);
    }

    @Override
    public ResponseEntity<Grade> createGrade(Grade grade) {
        Grade createGrade = gradeService.createGrade(grade);
        return ResponseEntity.ok(createGrade);
    }

    @Override
    public ResponseEntity<Grade> getGradeById(Long id) {
        Grade grade = gradeService.getGradeById(id);
        return ResponseEntity.ok(grade);
    }

    @Override
    public ResponseEntity<Grade> updateGrade(Long id, Grade grade) {
        Grade updateGrade = gradeService.updateGrade(grade, id);
        return ResponseEntity.ok(updateGrade);
    }

    @Override
    public ResponseEntity<Void> deleteGrade(Long id) {
        gradeService.deleteGrade(id);
        return ResponseEntity.noContent().build();
    }
}
