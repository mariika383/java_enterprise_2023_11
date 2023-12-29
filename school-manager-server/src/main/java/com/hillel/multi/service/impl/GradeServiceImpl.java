package com.hillel.multi.service.impl;

import com.hillel.multi.dto.GradeInfoDTO;
import com.hillel.multi.repository.GradeRepository;
import com.hillel.multi.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeServiceImpl implements GradeService {

    private final GradeRepository gradeRepository;
    @Override
    public GradeInfoDTO create(GradeInfoDTO gradeInfoDTO) {
        return null;
    }

    @Override
    public GradeInfoDTO read(Long id) {
        return null;
    }

    @Override
    public GradeInfoDTO update(GradeInfoDTO gradeInfoDTO, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<GradeInfoDTO> getAll() {
        return null;
    }
}
