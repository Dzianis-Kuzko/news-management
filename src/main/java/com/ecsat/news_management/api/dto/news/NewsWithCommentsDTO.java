package com.ecsat.news_management.api.dto.news;

import com.ecsat.news_management.api.dto.comment.CommentDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class NewsWithCommentsDTO {
    private int id;
    private LocalDateTime time;
    private String title;
    private String text;
    private List<CommentDTO> comments;
}
