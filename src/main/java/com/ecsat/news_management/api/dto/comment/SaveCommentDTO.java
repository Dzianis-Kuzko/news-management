package com.ecsat.news_management.api.dto.comment;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SaveCommentDTO {
    private LocalDateTime time;
    private String text;
    private String userName;
    private int newsId;
}
