package com.mjc.school.controller.implementation;

import com.mjc.school.controller.BaseController;
import com.mjc.school.service.dto.AuthorDto;
import com.mjc.school.service.implementation.AuthorService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController implements BaseController<AuthorDto, AuthorDto, Long> {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public List<AuthorDto> readAll() {
        return null;
    }

    @Override
    public AuthorDto readById(Long id) {
        return null;
    }

    @Override
    public AuthorDto create(AuthorDto createRequest) {
        return null;
    }

    @Override
    public AuthorDto update(AuthorDto updateRequest) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
