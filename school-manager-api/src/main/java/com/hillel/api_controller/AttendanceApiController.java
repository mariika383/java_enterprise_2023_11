package com.hillel.api_controller;

import com.hillel.api.AttendanceApi;
import com.hillel.model.Attendance;
import com.hillel.multi.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AttendanceApiController implements AttendanceApi {
    private final AttendanceService attendanceService;

    @Override
    public ResponseEntity<List<Attendance>> getAllAttendances() {
        List<Attendance> attendances = attendanceService.getAllAttendances();
        return ResponseEntity.ok(attendances);    }

    @Override
    public ResponseEntity<Attendance> createAttendance(Attendance attendance) {
        Attendance createdAttendance = attendanceService.createAttendance(attendance);
        return ResponseEntity.ok(createdAttendance);    }

    @Override
    public ResponseEntity<Attendance> getAttendanceById(Long id) {
        Attendance attendance = attendanceService.getAttendanceById(id);
        return ResponseEntity.ok(attendance);    }

    @Override
    public ResponseEntity<Attendance> updateAttendance(Long id, Attendance attendance) {
        Attendance updatedAttendance = attendanceService.updateAttendance(attendance, id);
        return ResponseEntity.ok(updatedAttendance);    }

    @Override
    public ResponseEntity<Void> deleteAttendance(Long id) {
        attendanceService.deleteAttendance(id);
        return ResponseEntity.noContent().build();    }
}
