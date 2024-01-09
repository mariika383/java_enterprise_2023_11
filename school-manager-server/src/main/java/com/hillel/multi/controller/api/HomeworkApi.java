package com.hillel.multi.controller.api;


import com.hillel.multi.model.classes.Homework;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/homeworks")
public interface HomeworkApi {
    @GetMapping
    ResponseEntity<List<Homework>> getAllHomeworks();

    @PostMapping
    ResponseEntity<Homework> createHomework(@Valid @RequestBody Homework homework);

    @GetMapping("/{id}")
    ResponseEntity<Homework> getHomeworkById(@PathVariable("id") Long id);

    @PutMapping("/{id}")
    ResponseEntity<Homework> updateHomework(@PathVariable("id") Long id, @Valid @RequestBody Homework homework);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteHomework(@PathVariable("id") Long id);
}
