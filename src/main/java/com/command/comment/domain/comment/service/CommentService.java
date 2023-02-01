package com.command.comment.domain.comment.service;

import com.command.comment.domain.comment.dto.CommentSaveRequestDto;
import com.command.comment.domain.comment.dto.CommentSaveResponseDto;
import com.command.comment.domain.comment.entity.Comment;
import com.command.comment.domain.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentSaveResponseDto save(CommentSaveRequestDto commentSaveRequestDto) {
        Comment comment = CommentSaveRequestDto.toComment(commentSaveRequestDto);
        return null;
    }

    @Transactional
    public void update(Long id, CommentSaveRequestDto dto) {
        Comment comment = commentRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 댓글이 존재하지 않습니다. id=" + id));

    }

    @Transactional
    public void delete(Long id){
        Comment comment = commentRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 댓글이 존재하지 않습니다. id=" + id));

        commentRepository.delete(comment);
    }




}

