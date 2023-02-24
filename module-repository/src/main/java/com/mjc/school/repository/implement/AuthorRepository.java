package com.mjc.school.repository.implement;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.data.DataSource;
import com.mjc.school.repository.model.impl.AuthorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AuthorRepository implements BaseRepository<AuthorEntity, Long> {
    private final DataSource dataSource;

    @Autowired
    public AuthorRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<AuthorEntity> readAll() {
        return dataSource.getAuthors();
    }

    @Override
    public Optional<AuthorEntity> readById(Long id) {
        return Optional.empty();
    }

    @Override
    public AuthorEntity create(AuthorEntity entity) {
        return null;
    }

    @Override
    public AuthorEntity update(AuthorEntity entity) {
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
