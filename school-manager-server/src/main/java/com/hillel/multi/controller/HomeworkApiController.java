package com.hillel.multi.controller;

import com.hillel.api.HomeworkApi;
import com.hillel.model.Homework;
import com.hillel.multi.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class HomeworkApiController implements HomeworkApi {
    @Autowired
    private HomeworkService homeworkService;
    @Override
    public ResponseEntity<List<Homework>> homeworkGet() {
        List<Homework> homeworkList = homeworkService.getAllHomeworks();

        if (homeworkList.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(homeworkList);
        }    }
}
