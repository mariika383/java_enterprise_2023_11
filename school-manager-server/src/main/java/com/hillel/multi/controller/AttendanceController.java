package com.hillel.multi.controller;

import com.hillel.multi.controller.api.AttendanceApi;
import com.hillel.multi.model.classes.Attendance;
import com.hillel.multi.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/attendance")
public class AttendanceController implements AttendanceApi {
    private final AttendanceService attendanceService;
    @Override
    public ResponseEntity<Attendance> present(Long id) {
        Attendance attendance = attendanceService.present(id);
        return ResponseEntity.ok(attendance);
    }
}
