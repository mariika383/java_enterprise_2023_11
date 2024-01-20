package com.hillel.multi.controller;

import com.hillel.api.GradeApi;
import com.hillel.model.Grade;
import com.hillel.multi.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Basic;
import java.util.List;

@Controller
public class GradeApiController implements GradeApi {
    @Autowired
    private GradeService gradeService;
    @Override
    public ResponseEntity<String> gradeGet() {
        try {
            List<Grade> grades = gradeService.getAllGrades();
            if (grades != null && !grades.isEmpty()) {
                return ResponseEntity.ok(grades.toString());
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Internal Server Error: " + e.getMessage());
        }
    }
}
