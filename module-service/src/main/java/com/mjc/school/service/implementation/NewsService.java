package com.mjc.school.service.implementation;

import com.mjc.school.repository.model.impl.NewsEntity;
import com.mjc.school.service.BaseService;
import com.mjc.school.service.dto.NewsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService implements BaseService<NewsDto, NewsEntity, Long> {
    @Override
    public List<NewsEntity> readAll() {
        return null;
    }

    @Override
    public NewsEntity readById(Long id) {
        return null;
    }

    @Override
    public NewsEntity create(NewsDto createRequest) {
        return null;
    }

    @Override
    public NewsEntity update(NewsDto updateRequest) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
