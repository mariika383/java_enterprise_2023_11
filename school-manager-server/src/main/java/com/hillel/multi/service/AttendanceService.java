package com.hillel.multi.service;



import com.hillel.model.Attendance;

import java.util.List;

public interface AttendanceService {
    Attendance createAttendance(Attendance attendance);
    Attendance getAttendanceById (Long id);
    Attendance updateAttendance(Attendance attendance, Long id);
    void deleteAttendance(Long id);
    List<Attendance> getAllAttendances();}
