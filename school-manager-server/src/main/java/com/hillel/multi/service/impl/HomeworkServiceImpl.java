package com.hillel.multi.service.impl;

import com.hillel.multi.dto.HomeworkInfoDTO;
import com.hillel.multi.repository.HomeworkRepository;
import com.hillel.multi.service.HomeworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeworkServiceImpl implements HomeworkService {
    private final HomeworkRepository homeworkRepository;
    @Override
    public HomeworkInfoDTO create(HomeworkInfoDTO homeworkInfoDTO) {
        return null;
    }

    @Override
    public HomeworkInfoDTO read(Long id) {
        return null;
    }

    @Override
    public HomeworkInfoDTO update(HomeworkInfoDTO homeworkInfoDTO, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<HomeworkInfoDTO> getAll() {
        return null;
    }
}
