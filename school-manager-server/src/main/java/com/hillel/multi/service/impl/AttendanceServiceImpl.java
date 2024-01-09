package com.hillel.multi.service.impl;


import com.hillel.multi.model.classes.Attendance;
import com.hillel.multi.model.repository.AttendanceRepository;
import com.hillel.multi.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {
    private final AttendanceRepository attendanceRepository;

    @Override
    public Attendance present(Long id) {
        return null;
    }
}
