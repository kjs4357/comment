package com.command.comment.domain.comment.controller;

import com.command.comment.domain.comment.dto.CommentSaveRequestDto;
import com.command.comment.domain.comment.dto.CommentSaveResponseDto;
import com.command.comment.domain.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //Json형태로 객체데이터를 반환
@RequiredArgsConstructor //간단한 방법으로 생성자 주입 방식의 코딩을 할 수 있다
@RequestMapping("/api")
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<CommentSaveResponseDto> save(@RequestBody CommentSaveRequestDto commentSaveRequestDto){
        CommentSaveResponseDto commentSaveResponseDto = commentService.save(commentSaveRequestDto);
        return ResponseEntity.ok(commentSaveResponseDto);
    }
}
