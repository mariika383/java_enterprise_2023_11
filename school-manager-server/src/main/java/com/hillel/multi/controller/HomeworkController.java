package com.hillel.multi.controller;

import com.hillel.multi.controller.api.HomeworkApi;
import com.hillel.multi.model.classes.Homework;
import com.hillel.multi.service.HomeworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/homework")
public class HomeworkController implements HomeworkApi {
    private final HomeworkService homeworkService;

    @Override
    public ResponseEntity<List<Homework>> getAllHomeworks() {
        List<Homework> homeworks = homeworkService.getAllHomeworks();
        return ResponseEntity.ok(homeworks);
    }

    @Override
    public ResponseEntity<Homework> createHomework(Homework homework) {
        Homework createHomework = homeworkService.createHomework(homework);
        return ResponseEntity.ok(createHomework);
    }

    @Override
    public ResponseEntity<Homework> getHomeworkById(Long id) {
        Homework homework = homeworkService.getByIdHomework(id);
        return ResponseEntity.ok(homework);
    }

    @Override
    public ResponseEntity<Homework> updateHomework(Long id, Homework homework) {
        Homework updateHomework = homeworkService.getByIdHomework(id);
        return ResponseEntity.ok(updateHomework);
    }

    @Override
    public ResponseEntity<Void> deleteHomework(Long id) {
        homeworkService.deleteHomework(id);
        return ResponseEntity.noContent().build();
    }
}
