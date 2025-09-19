package com.ecsat.news_management.api.dto.comment;

import java.time.LocalDateTime;

public class CommentDTO {
    private Integer id;
    private LocalDateTime time;
    private String text;
    private String userName;
    private int newsId;
}
