package com.hillel.multi.controller.api;


import com.hillel.multi.model.classes.Grade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/grades")
public interface GradeApi {
    @GetMapping
    ResponseEntity<List<Grade>> getAllGrades();

    @PostMapping
    ResponseEntity<Grade> createGrade(@Valid @RequestBody Grade grade);

    @GetMapping("/{id}")
    ResponseEntity<Grade> getGradeById(@PathVariable("id") Long id);

    @PutMapping("/{id}")
    ResponseEntity<Grade> updateGrade(@PathVariable("id") Long id, @Valid @RequestBody Grade grade);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteGrade(@PathVariable("id") Long id);
}
