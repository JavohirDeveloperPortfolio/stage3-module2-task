package com.mjc.school.service.implementation;

import com.mjc.school.repository.implement.NewsRepository;
import com.mjc.school.repository.model.impl.NewsModel;
import com.mjc.school.service.BaseService;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import com.mjc.school.service.exceptions.NewsCreateException;
import com.mjc.school.service.exceptions.NewsNotFoundException;
import com.mjc.school.service.exceptions.ServiceErrorCode;
import com.mjc.school.service.mapper.NewsMapper;
import com.mjc.school.service.validator.NewsValidator;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.mjc.school.service.exceptions.ServiceErrorCode.EXCEPTION_DURING_CREATE_NEWS;
import static com.mjc.school.service.exceptions.ServiceErrorCode.NEWS_ID_DOES_NOT_EXIST;

@Service
public class NewsService implements BaseService<NewsDtoRequest, NewsDtoResponse, Long> {
    private final NewsRepository repository;
    private final NewsValidator newsValidator;

    public NewsService(NewsRepository newsRepository) {
        this.repository = newsRepository;
        this.newsValidator = NewsValidator.getNewsValidator();
    }

    @Override
    public List<NewsDtoResponse> readAll() {
        return repository.readAll().stream()
                .map(NewsMapper.INSTANCE::newsModelToDto)
                .toList();
    }

    @Override
    public NewsDtoResponse readById(Long id){
        try {
            NewsDtoResponse newsDtoResponse = repository.readById(id).stream()
                    .map(NewsMapper.INSTANCE::newsModelToDto)
                    .toList()
                    .get(0);
            return newsDtoResponse;
        }catch (RuntimeException e){
            throw new NewsNotFoundException(
                    String.format(String.valueOf(NEWS_ID_DOES_NOT_EXIST.getMessage()), id)
            );
        }
    }

    @Override
    public NewsDtoResponse create(NewsDtoRequest createRequest) {
        try {
            newsValidator.validateNews(createRequest);
            NewsModel news = new NewsModel(
                    createRequest.title(),
                    createRequest.content(),
                    createRequest.authorId()
            );

            NewsModel newsModel = repository.create(news);
            return NewsMapper.INSTANCE.newsModelToDto(newsModel);
        }catch (RuntimeException e){
            throw new NewsCreateException(
                    String.valueOf(EXCEPTION_DURING_CREATE_NEWS.getMessage())
            );
        }
    }

    @Override
    public NewsDtoResponse update(NewsDtoRequest updateRequest) {

        return null;
    }

    @Override
    public boolean deleteById(Long id) {

        return false;
    }
}
