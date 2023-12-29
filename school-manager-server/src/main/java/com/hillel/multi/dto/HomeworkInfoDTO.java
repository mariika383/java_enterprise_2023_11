package com.hillel.multi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@RequiredArgsConstructor
@Getter
@Setter
public class HomeworkInfoDTO {
    @NotEmpty
    private String description;
    @NotEmpty
    private Date dueDate;
}
