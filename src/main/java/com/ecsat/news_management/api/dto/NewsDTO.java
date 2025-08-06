package com.ecsat.news_management.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NewsDTO {
    private int id;
    private LocalDateTime time;
    private String title;
    private String text;
}
