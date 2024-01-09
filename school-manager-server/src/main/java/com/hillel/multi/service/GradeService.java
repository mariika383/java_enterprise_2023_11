package com.hillel.multi.service;

import com.hillel.multi.model.classes.Grade;

import java.util.List;

public interface GradeService {
    Grade createGrade(Grade grade);
    Grade getGradeById (Long id);
    Grade updateGrade(Grade grade, Long id);
    void deleteGrade(Long id);
    List<Grade> getAllGrades();
}
