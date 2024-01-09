package com.hillel.multi.service.impl;


import com.hillel.multi.model.classes.Homework;
import com.hillel.multi.model.repository.HomeworkRepository;
import com.hillel.multi.service.HomeworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeworkServiceImpl implements HomeworkService {
    private final HomeworkRepository homeworkRepository;


    @Override
    public Homework createHomework(Homework homework) {
        return null;
    }

    @Override
    public Homework getByIdHomework(Long id) {
        return null;
    }

    @Override
    public Homework updateHomework(Homework homework, Long id) {
        return null;
    }

    @Override
    public void deleteHomework(Long id) {

    }

    @Override
    public List<Homework> getAllHomeworks() {
        return null;
    }
}
