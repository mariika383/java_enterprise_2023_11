package com.hillel.multi.controller;

import com.hillel.multi.dto.GradeInfoDTO;
import com.hillel.multi.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/grade")
public class GradeController {
    private final GradeService gradeService;
    @PostMapping
    public GradeInfoDTO createGrade(@RequestBody GradeInfoDTO createGradeSDTO){
        return gradeService.create(createGradeSDTO);
    }
    @GetMapping
    public GradeInfoDTO readGrade(@RequestParam Long id){
        return gradeService.read(id);
    }
    @PutMapping
    public GradeInfoDTO updateGrade(@RequestBody GradeInfoDTO updateGradeDTO, @RequestParam Long id){
        return gradeService.update(updateGradeDTO, id);
    }
    @DeleteMapping
    public void deleteGrade(@RequestParam Long id){
        gradeService.delete(id);
    }
    @GetMapping("/list")
    public List<GradeInfoDTO> gradeList(){
        return gradeService.getAll();
    }
}
