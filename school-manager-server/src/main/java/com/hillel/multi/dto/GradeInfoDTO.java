package com.hillel.multi.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@RequiredArgsConstructor
@Getter
@Setter
public class GradeInfoDTO {
    @NotEmpty
    private String subject;
    @NotNull
    private double grade;
}
