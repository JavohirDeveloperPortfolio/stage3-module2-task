package com.mjc.school.service.dto;

public record NewsDtoRequest(String title,
                             String content,
                             Long authorId) {
}
