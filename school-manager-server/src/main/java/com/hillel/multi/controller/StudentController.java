package com.hillel.multi.controller;

import com.hillel.multi.dto.StudentInfoDTO;
import com.hillel.multi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/manager/student")
public class StudentController {
    private final StudentService studentService;
    @PostMapping
    public StudentInfoDTO createStudent(@RequestBody StudentInfoDTO createStudentDTO){
        return studentService.create(createStudentDTO);
    }
    @GetMapping
    public StudentInfoDTO readStudent(@RequestParam Long id){
        return studentService.read(id);
    }
    @PutMapping
    public StudentInfoDTO updateStudent(@RequestBody StudentInfoDTO updateStudentDTO, @RequestParam Long id){
        return studentService.update(updateStudentDTO, id);
    }
    @DeleteMapping
    public void deleteStudent(@RequestParam Long id){
        studentService.delete(id);
    }
    @GetMapping("/list")
    public List<StudentInfoDTO> studentList(){
        return studentService.getAll();
    }
}
