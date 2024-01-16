package com.hillel.api_controller;

import com.hillel.api.HomeworkApi;
import com.hillel.model.Homework;
import com.hillel.multi.service.HomeworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeworkApiController implements HomeworkApi {
    private final HomeworkService homeworkService;
    @Override
    public ResponseEntity<List<Homework>> getAllHomeworks() {
        List<Homework> homeworks = homeworkService.getAllHomeworks();
        return ResponseEntity.ok(homeworks);    }

    @Override
    public ResponseEntity<Homework> createHomework(Homework homework) {
        Homework createdHomework = homeworkService.createHomework(homework);
        return ResponseEntity.ok(createdHomework);    }

    @Override
    public ResponseEntity<Homework> getHomeworkById(Long id) {
        Homework homework = homeworkService.getByIdHomework(id);
        return ResponseEntity.ok(homework);    }

    @Override
    public ResponseEntity<Homework> updateHomework(Long id, Homework homework) {
        Homework updatedHomework = homeworkService.updateHomework(homework, id);
        return ResponseEntity.ok(updatedHomework);    }

    @Override
    public ResponseEntity<Void> deleteHomework(Long id) {
        homeworkService.deleteHomework(id);
        return ResponseEntity.noContent().build();
    }
}
