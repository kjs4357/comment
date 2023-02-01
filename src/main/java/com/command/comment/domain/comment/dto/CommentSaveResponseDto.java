package com.command.comment.domain.comment.dto;

import lombok.Getter;

@Getter
public record CommentSaveResponseDto (
        long id,
        String content
) {

}
