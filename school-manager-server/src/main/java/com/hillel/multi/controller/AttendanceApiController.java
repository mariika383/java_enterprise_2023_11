package com.hillel.multi.controller;

import com.hillel.api.AttendanceApi;
import com.hillel.multi.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class AttendanceApiController implements AttendanceApi {

    @Autowired
    private AttendanceService attendanceService;
    @Override
    public ResponseEntity<Void> attendanceGet() {
        boolean isPresent = attendanceService.checkAttendance();
        if (isPresent) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
