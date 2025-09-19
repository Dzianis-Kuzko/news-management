package com.ecsat.news_management.core.exception;

public class NewsNotFoundException extends RuntimeException {
    public NewsNotFoundException(Integer newsId) {
        super("News with ID " + newsId + " not found");
    }
}
