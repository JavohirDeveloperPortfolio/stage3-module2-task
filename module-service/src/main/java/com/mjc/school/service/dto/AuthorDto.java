package com.mjc.school.service.dto;

import javax.validation.constraints.Size;

public class AuthorDto {
    private Long id;
    @Size(min = 3, max = 15)
    private String name;

    public AuthorDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
