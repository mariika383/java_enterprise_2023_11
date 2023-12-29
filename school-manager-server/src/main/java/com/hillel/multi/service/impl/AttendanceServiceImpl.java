package com.hillel.multi.service.impl;

import com.hillel.multi.dto.AttendanceInfoDTO;
import com.hillel.multi.repository.AttendanceRepository;
import com.hillel.multi.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {
    private final AttendanceRepository attendanceRepository;
    @Override
    public AttendanceInfoDTO present(Long id) {
        return null;
    }
}
