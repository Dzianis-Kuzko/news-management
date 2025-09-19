package com.ecsat.news_management.core.service;

import com.ecsat.news_management.api.dto.news.NewsDTO;
import com.ecsat.news_management.core.entity.News;
import com.ecsat.news_management.core.exception.NewsNotFoundException;
import com.ecsat.news_management.core.mapper.NewsMapper;
import com.ecsat.news_management.core.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsService {

    @Autowired
    private final NewsRepository newsRepository;
    @Autowired
    private final NewsMapper newsMapper;

    public NewsDTO get(int newsId) {
        News news = newsRepository.findById(newsId)
                .orElseThrow(() -> new NewsNotFoundException(newsId));

        return newsMapper.toDTO(news);
    }
}
