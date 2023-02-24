package com.example.hanghaeworld.dto;

import com.example.hanghaeworld.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class CommentResponseDto {
    private Long commentId;
    private String content;
    private String nickName;
    private LocalDateTime createdAt;

    public CommentResponseDto(Comment comment){
        this.commentId = comment.getId();
        this.content = comment.getContent();
        this.nickName = comment.getUser().getNickname();
        this.createdAt = comment.getCreatedAt();
    }
}
