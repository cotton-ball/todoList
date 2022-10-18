package com.example.todolist.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts { //싷제 DB와 매치될 클래스(엔티티 클래스)
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk의 생성 규칙
    private Long id;

    @Column(length = 500,nullable = false)//테이블의 칼럼 , 선언하지 않아도 해당 클래스의 필드는 모두 칼럼이 된다
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

    @Builder //빌더 클래스 자동 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
