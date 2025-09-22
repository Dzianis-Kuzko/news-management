package com.ecsat.news_management.core.mapper;

import com.ecsat.news_management.api.dto.news.NewsDTO;
import com.ecsat.news_management.api.dto.news.SaveNewsDTO;
import com.ecsat.news_management.core.entity.News;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface NewsMapper {
    NewsDTO toNewsDTO(News news);

    News toNews(SaveNewsDTO saveNewsDTO);

    void updateNewsFromSaveNewsDTO(SaveNewsDTO dto, @MappingTarget News news);
}
