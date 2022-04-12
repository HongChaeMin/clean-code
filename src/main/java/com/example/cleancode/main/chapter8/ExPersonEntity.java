package com.example.cleancode.main.chapter8;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ExPersonEntity {

    private Long personSeq;
    private String personName;
    private int age;

}
