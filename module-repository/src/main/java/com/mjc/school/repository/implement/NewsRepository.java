package com.mjc.school.repository.implement;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.data.DataSource;
import com.mjc.school.repository.model.impl.NewsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NewsRepository implements BaseRepository<NewsEntity,Long> {
    private final DataSource dataSource;

    @Autowired
    public NewsRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<NewsEntity> readAll() {
        return dataSource.getNews();
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
