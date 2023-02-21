package com.mjc.school.repository.implement;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.model.impl.AuthorEntity;

import java.util.List;
import java.util.Optional;

public class AuthorRepository implements BaseRepository<AuthorEntity, Long> {
    @Override
    public List<AuthorEntity> readAll() {
        return null;
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
