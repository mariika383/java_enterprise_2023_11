package com.hillel.multi.service.impl;

import com.hillel.multi.model.classes.Grade;
import com.hillel.multi.model.repository.GradeRepository;
import com.hillel.multi.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeServiceImpl implements GradeService {

    private final GradeRepository gradeRepository;

    @Override
    public Grade createGrade(Grade grade) {
        return null;
    }

    @Override
    public Grade getGradeById(Long id) {
        return null;
    }

    @Override
    public Grade updateGrade(Grade grade, Long id) {
        return null;
    }

    @Override
    public void deleteGrade(Long id) {

    }

    @Override
    public List<Grade> getAllGrades() {
        return null;
    }
}
