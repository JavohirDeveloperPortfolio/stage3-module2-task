package com.mjc.school.service.validator;

import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.exceptions.ValidatorException;

import static com.mjc.school.service.exceptions.ServiceErrorCode.AUTHOR_ID_DOES_NOT_EXIST;
import static com.mjc.school.service.exceptions.ServiceErrorCode.VALIDATE_STRING_LENGTH;

public class NewsValidator {
    private static final String NEWS_ID = "News id";
    private static final String NEWS_CONTENT = "News content";
    private static final String AUTHOR_ID = "Author id";
    private static final String NEWS_TITLE = "News title";
    private static final Integer NEWS_CONTENT_MIN_LENGTH = 5;
    private static final Integer NEWS_CONTENT_MAX_LENGTH = 255;
    private static final Integer NEWS_TITLE_MIN_LENGTH = 5;
    private static final Integer NEWS_TITLE_MAX_LENGTH = 30;
    private static final Integer MAX_AUTHOR_ID = 20;
    private static NewsValidator newsValidator;

    public static NewsValidator getNewsValidator(){
        if (newsValidator == null){
            newsValidator = new NewsValidator();
        }
        return newsValidator;
    }

    public void validateNews(NewsDtoRequest newsDtoRequest){
        validateNewsAuthorId(newsDtoRequest.authorId());
        validateNewsTitle(newsDtoRequest.title());
        validateNewsContent(newsDtoRequest.content());
    }

    public void validateNewsAuthorId(Long authorId){
        if (authorId == null || authorId < 1)
            throw new ValidatorException(
                    String.format(String.valueOf(AUTHOR_ID_DOES_NOT_EXIST.getMessage()), authorId)
            );
    }

    public void validateNewsTitle(String title){
        if (title.length() >= NEWS_TITLE_MIN_LENGTH && title.length() <= NEWS_TITLE_MAX_LENGTH)
            throw new ValidatorException(
                    String.format(String.valueOf(VALIDATE_STRING_LENGTH.getMessage()), NEWS_TITLE_MIN_LENGTH, NEWS_TITLE_MAX_LENGTH)
            );
    }

    public void validateNewsContent(String content){
        if (content.length() >= NEWS_CONTENT_MIN_LENGTH && content.length() <= NEWS_CONTENT_MAX_LENGTH)
            throw new ValidatorException(
                    String.format(String.valueOf(VALIDATE_STRING_LENGTH.getMessage()), NEWS_CONTENT_MIN_LENGTH, NEWS_CONTENT_MAX_LENGTH)
            );
    }
}
