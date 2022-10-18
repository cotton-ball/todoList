package com.example.todolist.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {//응답
    private final String name;
    private final int amount;



}
