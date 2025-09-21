package com.ecsat.news_management.core.mapper;


import com.ecsat.news_management.api.dto.news.NewsDTO;
import com.ecsat.news_management.core.entity.News;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


public class NewsMapperTest {


    private NewsMapper newsMapper = new NewsMapperImpl();

    @Test
    void shouldProperlyMapNewsToNewsDTO() {
        News news = new News();
        news.setId(1);
        news.setTime(LocalDateTime.of(2025, 2, 20, 15, 34));
        news.setText("text");
        news.setTitle("title");

        NewsDTO dto = newsMapper.toNewsDTO(news);

        Assertions.assertNotNull(dto);
        Assertions.assertEquals(news.getId(), dto.getId());
        Assertions.assertEquals(news.getTime(), dto.getTime());
        Assertions.assertEquals(news.getText(), dto.getText());
        Assertions.assertEquals(news.getTitle(), dto.getTitle());
    }
}
