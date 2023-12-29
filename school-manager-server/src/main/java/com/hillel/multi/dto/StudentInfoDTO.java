package com.hillel.multi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;

@RequiredArgsConstructor
@Getter
@Setter
public class StudentInfoDTO {
    @Max(value = 20)
    private String firstName;
    @Max(value = 20)
    private String lastName;
}
