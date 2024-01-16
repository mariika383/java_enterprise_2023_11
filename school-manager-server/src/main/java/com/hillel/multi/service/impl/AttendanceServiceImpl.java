package com.hillel.multi.service.impl;


import com.hillel.model.Attendance;
import com.hillel.multi.repository.AttendanceRepository;
import com.hillel.multi.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {
    private final AttendanceRepository attendanceRepository;

    @Override
    public Attendance createAttendance(Attendance attendance) {
        return null;
    }

    @Override
    public Attendance getAttendanceById(Long id) {
        return null;
    }

    @Override
    public Attendance updateAttendance(Attendance attendance, Long id) {
        return null;
    }

    @Override
    public void deleteAttendance(Long id) {

    }

    @Override
    public List<Attendance> getAllAttendances() {
        return null;
    }
}
