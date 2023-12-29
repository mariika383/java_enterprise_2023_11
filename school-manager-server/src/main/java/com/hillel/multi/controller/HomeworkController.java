package com.hillel.multi.controller;

import com.hillel.multi.dto.HomeworkInfoDTO;
import com.hillel.multi.service.HomeworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/homework")
public class HomeworkController {
    private final HomeworkService homeworkService;
    @PostMapping
    public HomeworkInfoDTO createHomework(@RequestBody HomeworkInfoDTO createHomeworkSDTO){
        return homeworkService.create(createHomeworkSDTO);
    }
    @GetMapping
    public HomeworkInfoDTO readHomework(@RequestParam Long id){
        return homeworkService.read(id);
    }
    @PutMapping
    public HomeworkInfoDTO updateHomework(@RequestBody HomeworkInfoDTO updateHomeworkDTO, @RequestParam Long id){
        return homeworkService.update(updateHomeworkDTO, id);
    }
    @DeleteMapping
    public void deleteHomework(@RequestParam Long id){
        homeworkService.delete(id);
    }
    @GetMapping("/list")
    public List<HomeworkInfoDTO> homeworkList(){
        return homeworkService.getAll();
    }
}
