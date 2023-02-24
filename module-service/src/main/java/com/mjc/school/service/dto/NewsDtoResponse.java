package com.mjc.school.service.dto;

import java.time.LocalDateTime;

public record NewsDtoResponse(Long id,
                              String title,
                              String content,
                              Long authorId,
                              LocalDateTime createDate,
                              LocalDateTime lastUpdateDate) {
}
