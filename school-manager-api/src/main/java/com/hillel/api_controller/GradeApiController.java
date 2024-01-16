package com.hillel.api_controller;

import com.hillel.api.GradeApi;
import com.hillel.model.Grade;
import com.hillel.multi.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GradeApiController implements GradeApi {
    private final GradeService gradeService;
    @Override
    public ResponseEntity<List<Grade>> getAllGrades() {
        List<Grade> grades = gradeService.getAllGrades();
        return new ResponseEntity<>(grades, HttpStatus.OK);    }

    @Override
    public ResponseEntity<Grade> createGrade(Grade grade) {
        Grade createdGrade = gradeService.createGrade(grade);
        return new ResponseEntity<>(createdGrade, HttpStatus.CREATED);    }

    @Override
    public ResponseEntity<Grade> getGradeById(Long id) {
        Grade grade = gradeService.getGradeById(id);
        return new ResponseEntity<>(grade, HttpStatus.OK);    }

    @Override
    public ResponseEntity<Grade> updateGrade(Long id, Grade grade) {
        Grade updatedGrade = gradeService.updateGrade(grade, id);
        return new ResponseEntity<>(updatedGrade, HttpStatus.OK);    }

    @Override
    public ResponseEntity<Void> deleteGrade(Long id) {
        gradeService.deleteGrade(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);    }
}
