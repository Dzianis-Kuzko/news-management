package com.ecsat.news_management.core.mapper;

import com.ecsat.news_management.api.dto.news.NewsDTO;
import com.ecsat.news_management.core.entity.News;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewsMapper {
    NewsDTO toDTO(News news);

    News toNews(NewsDTO newsDTO);
}
