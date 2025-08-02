package com.xworkz.monsoon.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@RequiredArgsConstructor
@ToString
public class CustomerDTO {
    private long id;
    private String firstName, lastName;
}
