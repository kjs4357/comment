package com.command.comment.domain.comment.dto;

import com.command.comment.domain.comment.entity.Comment;
import lombok.Getter;

@Getter
public record CommentSaveRequestDto (
        String content
) {
    public static Comment toComment(CommentSaveRequestDto commentSaveRequestDto) {
        return Comment.builder()
                .content(commentSaveRequestDto.content())
                .build();
    }
}
