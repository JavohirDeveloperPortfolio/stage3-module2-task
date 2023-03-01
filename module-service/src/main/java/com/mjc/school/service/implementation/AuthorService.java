package com.mjc.school.service.implementation;

import com.mjc.school.repository.implement.AuthorRepository;
import com.mjc.school.repository.model.impl.AuthorModel;
import com.mjc.school.service.BaseService;
import com.mjc.school.service.dto.AuthorDtoRequest;
import com.mjc.school.service.dto.AuthorDtoResponse;
import com.mjc.school.service.exceptions.AuthorNotFoundException;
import com.mjc.school.service.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.mjc.school.service.exceptions.ServiceErrorCode.AUTHOR_ID_DOES_NOT_EXIST;

@Service
public class AuthorService implements BaseService<AuthorDtoRequest, AuthorDtoResponse, Long> {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorDtoResponse> readAll() {
        return authorRepository.readAll().stream()
                .map(AuthorMapper.INSTANCE::authorModelToDto)
                .toList();
    }

    @Override
    public AuthorDtoResponse readById(Long id) {
        try {
            Optional<AuthorModel> authorModel = authorRepository.readById(id);
            return AuthorMapper.INSTANCE.authorModelToDto(authorModel.get());
        }catch (RuntimeException e){
            throw new AuthorNotFoundException(
                    String.format(String.valueOf(AUTHOR_ID_DOES_NOT_EXIST.getMessage()), id)
            );
        }
    }

    @Override
    public AuthorDtoResponse create(AuthorDtoRequest createRequest) {
        return null;
    }

    @Override
    public AuthorDtoResponse update(AuthorDtoRequest updateRequest) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
