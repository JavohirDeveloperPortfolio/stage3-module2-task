package com.mjc.school.service.implementation;

import com.mjc.school.repository.implement.NewsRepository;
import com.mjc.school.repository.model.impl.NewsEntity;
import com.mjc.school.service.BaseService;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import com.mjc.school.service.mapper.NewsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService implements BaseService<NewsDtoRequest, NewsDtoResponse, Long> {
    private final NewsRepository repository;

    public NewsService(NewsRepository newsRepository) {
        this.repository = newsRepository;
    }

    @Override
    public List<NewsDtoResponse> readAll() {
        return repository.readAll().stream()
                .map(NewsMapper.INSTANCE::newsModelToDto)
                .toList();
    }

    @Override
    public NewsDtoResponse readById(Long id) {
        return null;
    }

    @Override
    public NewsDtoResponse create(NewsDtoRequest createRequest) {
        return null;
    }

    @Override
    public NewsDtoResponse update(NewsDtoRequest updateRequest) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
