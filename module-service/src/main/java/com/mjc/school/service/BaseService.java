package com.mjc.school.service;

import com.mjc.school.service.exceptions.NewsNotFoundException;

import java.util.List;

public interface BaseService<T, R, K> {
    List<R> readAll();

    R readById(K id) throws NewsNotFoundException;

    R create(T createRequest);

    R update(T updateRequest);

    boolean deleteById(K id);
}
