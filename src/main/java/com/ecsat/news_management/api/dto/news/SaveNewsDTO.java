package com.ecsat.news_management.api.dto.news;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class SaveNewsDTO {
    private LocalDateTime time;
    private String title;
    private String text;
}
