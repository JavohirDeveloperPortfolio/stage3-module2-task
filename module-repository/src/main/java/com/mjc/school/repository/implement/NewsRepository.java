package com.mjc.school.repository.implement;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.model.impl.NewsEntity;

import java.util.List;
import java.util.Optional;

public class NewsRepository implements BaseRepository<NewsEntity,Long> {
    @Override
    public List<NewsEntity> readAll() {
        return null;
    }

    @Override
    public Optional<NewsEntity> readById(Long id) {
        return Optional.empty();
    }

    @Override
    public NewsEntity create(NewsEntity entity) {
        return null;
    }

    @Override
    public NewsEntity update(NewsEntity entity) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean existById(Long id) {
        return false;
    }
}
