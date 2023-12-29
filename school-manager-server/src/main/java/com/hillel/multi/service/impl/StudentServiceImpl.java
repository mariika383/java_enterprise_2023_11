package com.hillel.multi.service.impl;

import com.hillel.multi.dto.StudentInfoDTO;
import com.hillel.multi.repository.StudentRepository;
import com.hillel.multi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public StudentInfoDTO create(StudentInfoDTO studentInfoDTO) {
        return null;
    }

    @Override
    public StudentInfoDTO read(Long id) {
        return null;
    }

    @Override
    public StudentInfoDTO update(StudentInfoDTO studentInfoDTO, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<StudentInfoDTO> getAll() {
        return null;
    }
}
