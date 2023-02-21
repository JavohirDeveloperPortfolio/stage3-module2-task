package com.mjc.school.controller.implementation;

import com.mjc.school.controller.BaseController;
import com.mjc.school.service.dto.NewsDto;
import com.mjc.school.service.implementation.NewsService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class NewsController implements BaseController<NewsDto, NewsDto,Long> {
    private final NewsService newsService;

    public NewsController() {
        this.newsService = new NewsService();
    }

    @Override
    public List<NewsDto> readAll() {
        return null;
    }

    @Override
    public NewsDto readById(Long id) {
        return null;
    }

    @Override
    public NewsDto create(NewsDto createRequest) {
        return null;
    }

    @Override
    public NewsDto update(NewsDto updateRequest) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
