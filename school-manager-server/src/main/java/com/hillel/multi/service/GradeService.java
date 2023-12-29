package com.hillel.multi.service;

import com.hillel.multi.dto.GradeInfoDTO;

import java.util.List;

public interface GradeService {
    GradeInfoDTO create(GradeInfoDTO gradeInfoDTO);
    GradeInfoDTO read (Long id);
    GradeInfoDTO update(GradeInfoDTO gradeInfoDTO, Long id);
    void delete(Long id);
    List<GradeInfoDTO> getAll();
}
