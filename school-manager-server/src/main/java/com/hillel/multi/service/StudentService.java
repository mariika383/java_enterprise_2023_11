package com.hillel.multi.service;

import com.hillel.multi.dto.StudentInfoDTO;

import java.util.List;

public interface StudentService {
    StudentInfoDTO create(StudentInfoDTO studentInfoDTO);
    StudentInfoDTO read (Long id);
    StudentInfoDTO update(StudentInfoDTO studentInfoDTO, Long id);
    void delete(Long id);
    List<StudentInfoDTO> getAll();
}
