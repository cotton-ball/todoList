package com.example.todolist.web;

import com.example.todolist.web.dto.PostsSaveRequestDto;
import com.example.todolist.web.dto.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;
    //생성자 주입

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }
}
