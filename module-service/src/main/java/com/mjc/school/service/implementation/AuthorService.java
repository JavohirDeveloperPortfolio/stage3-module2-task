package com.mjc.school.service.implementation;

import com.mjc.school.repository.implement.AuthorRepository;
import com.mjc.school.repository.model.impl.AuthorEntity;
import com.mjc.school.service.BaseService;
import com.mjc.school.service.dto.AuthorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements BaseService<AuthorDto, AuthorEntity, Long> {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorEntity> readAll() {
        return authorRepository.readAll();
    }

    @Override
    public AuthorEntity readById(Long id) {
        return null;
    }

    @Override
    public AuthorEntity create(AuthorDto createRequest) {
        return null;
    }

    @Override
    public AuthorEntity update(AuthorDto updateRequest) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
