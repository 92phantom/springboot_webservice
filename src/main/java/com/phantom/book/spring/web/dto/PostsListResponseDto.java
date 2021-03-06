package com.phantom.book.spring.web.dto;

import com.phantom.book.spring.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifyDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.modifyDate = entity.getModifyDate();
        this.author = entity.getAuthor();
    }
}
