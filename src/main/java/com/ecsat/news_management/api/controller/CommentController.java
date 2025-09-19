package com.ecsat.news_management.api.controller;

import com.ecsat.news_management.api.dto.comment.CommentDTO;
import com.ecsat.news_management.api.dto.comment.SaveCommentDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news/{newsId}/comments")
public class CommentController {


    @GetMapping("/{commentsId}")
    public CommentDTO get(
            @PathVariable int newsId,
            @PathVariable int commentsId
    ) {

        return new CommentDTO();
    }

    @PostMapping
    public CommentDTO create(
            @PathVariable int newsId,
            @RequestBody SaveCommentDTO saveCommentDTO
    ) {

        return new CommentDTO();
    }

    @PutMapping("/{commentsId}")
    public CommentDTO update(
            @PathVariable int newsId,
            @PathVariable int commentsId,
            @RequestBody SaveCommentDTO saveCommentDTO
    ) {
        return new CommentDTO();

    }

    @DeleteMapping("/{commentsId}")
    public void delete(
            @PathVariable int newsId,
            @PathVariable int commentsId
    ) {

    }

}
