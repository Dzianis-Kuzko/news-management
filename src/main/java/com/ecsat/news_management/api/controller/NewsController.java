package com.ecsat.news_management.api.controller;

import com.ecsat.news_management.api.dto.news.NewsDTO;
import com.ecsat.news_management.api.dto.news.NewsWithCommentsDTO;
import com.ecsat.news_management.api.dto.news.SaveNewsDTO;
import com.ecsat.news_management.core.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;

    @GetMapping("/{newsId}")
    public NewsDTO get(@PathVariable int newsId) {
        return newsService.get(newsId);
    }

    @PostMapping
    public NewsDTO create(@RequestBody SaveNewsDTO saveNewsDTO) {
        return newsService.create(saveNewsDTO);
    }

    @PutMapping("/{newsId}")
    public NewsDTO update(@PathVariable Integer newsId,
                          @RequestBody SaveNewsDTO saveNewsDTO) {
        return newsService.update(newsId, saveNewsDTO);
    }

    @DeleteMapping("/{newsId}")
    public void delete(@PathVariable int newsID) {

    }

    @GetMapping
    public List<NewsDTO> getAll() {
        return new ArrayList<>();
    }

    @GetMapping("/{newsId}/comments")
    public NewsWithCommentsDTO getNewsWithComments(@PathVariable int newsId) {
        return new NewsWithCommentsDTO();
    }
}
