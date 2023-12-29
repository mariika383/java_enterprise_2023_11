package com.hillel.multi.controller;

import com.hillel.multi.dto.AttendanceInfoDTO;
import com.hillel.multi.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/attendance")
public class AttendanceController {
    private final AttendanceService attendanceService;
    @PostMapping("/present/{id}")
    public AttendanceInfoDTO present(@PathVariable Long id){
        return attendanceService.present(id);
    }
}
