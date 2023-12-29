package com.hillel.multi.service;

import com.hillel.multi.dto.HomeworkInfoDTO;

import java.util.List;

public interface HomeworkService {
    HomeworkInfoDTO create(HomeworkInfoDTO homeworkInfoDTO);
    HomeworkInfoDTO read (Long id);
    HomeworkInfoDTO update(HomeworkInfoDTO homeworkInfoDTO, Long id);
    void delete(Long id);
    List<HomeworkInfoDTO> getAll();
}
