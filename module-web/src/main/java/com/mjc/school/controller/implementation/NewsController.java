package com.mjc.school.controller.implementation;

import com.mjc.school.controller.BaseController;
import com.mjc.school.service.dto.NewsDtoResponse;
import com.mjc.school.service.implementation.NewsService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class NewsController implements BaseController<NewsDtoResponse, NewsDtoResponse, Long> {
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @Override
    public List<NewsDtoResponse> readAll() {
        return newsService.readAll();
    }

    @Override
    public NewsDtoResponse readById(Long id) {
        return null;
    }

    @Override
    public NewsDtoResponse create(NewsDtoResponse createRequest) {
        return null;
    }

    @Override
    public NewsDtoResponse update(NewsDtoResponse updateRequest) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
