package com.hillel.multi.controller;

import com.hillel.multi.model.classes.Homework;
import com.hillel.multi.service.HomeworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/homework")
public class HomeworkController  {
    private final HomeworkService homeworkService;
    @GetMapping
    public ResponseEntity<List<Homework>> getAllHomeworks() {
        List<Homework> homeworks = homeworkService.getAllHomeworks();
        return ResponseEntity.ok(homeworks);
    }

    @PostMapping
    public ResponseEntity<Homework> createHomework(@RequestBody Homework homework) {
        Homework createHomework = homeworkService.createHomework(homework);
        return ResponseEntity.ok(createHomework);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Homework> getHomeworkById(@PathVariable Long id) {
        Homework homework = homeworkService.getByIdHomework(id);
        return ResponseEntity.ok(homework);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Homework> updateHomework(@PathVariable Long id, @RequestBody Homework homework) {
        Homework updateHomework = homeworkService.getByIdHomework(id);
        return ResponseEntity.ok(updateHomework);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHomework(@PathVariable Long id) {
        homeworkService.deleteHomework(id);
        return ResponseEntity.noContent().build();
    }
}
