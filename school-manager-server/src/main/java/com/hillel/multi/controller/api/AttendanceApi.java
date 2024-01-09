package com.hillel.multi.controller.api;


import com.hillel.multi.model.classes.Attendance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/attendance")
public interface AttendanceApi {
    @GetMapping("/{id}")
    ResponseEntity<Attendance> present(@PathVariable("id") Long id);

}
