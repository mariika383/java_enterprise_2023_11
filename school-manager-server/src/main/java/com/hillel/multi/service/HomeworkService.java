package com.hillel.multi.service;


import com.hillel.multi.model.classes.Homework;

import java.util.List;

public interface HomeworkService {
    Homework createHomework(Homework homework);
    Homework getByIdHomework (Long id);
    Homework updateHomework(Homework homework, Long id);
    void deleteHomework(Long id);
    List<Homework> getAllHomeworks();
}
