package com.hillel.multi.controller;

import com.hillel.multi.model.classes.Attendance;
import com.hillel.multi.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/attendance")
public class AttendanceController {
    private final AttendanceService attendanceService;
    @GetMapping
    public ResponseEntity<List<Attendance>> getAllAttendances() {
        List<Attendance> attendances = attendanceService.getAllAttendances();
        return ResponseEntity.ok(attendances);
    }
    @PostMapping
    public ResponseEntity<Attendance> createAttendance(@RequestBody Attendance attendance) {
        Attendance createAttendance = attendanceService.createAttendance(attendance);
        return ResponseEntity.ok(createAttendance);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Attendance> getAttendanceById(@PathVariable Long id) {
        Attendance attendance = attendanceService.getAttendanceById(id);
        return ResponseEntity.ok(attendance);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Attendance> updateGrade(@PathVariable Long id, Attendance attendance) {
        Attendance updateAttendance = attendanceService.updateAttendance(attendance, id);
        return ResponseEntity.ok(updateAttendance);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAttendance(@PathVariable Long id) {
        attendanceService.deleteAttendance(id);
        return ResponseEntity.noContent().build();
    }
}
