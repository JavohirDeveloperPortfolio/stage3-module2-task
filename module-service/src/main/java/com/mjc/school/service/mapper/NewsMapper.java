package com.mjc.school.service.mapper;

import com.mjc.school.repository.model.impl.NewsModel;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewsMapper {

    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);

    NewsDtoResponse newsModelToDto(NewsModel news);

    @Mappings(value = {
            @Mapping(target = "createDate", ignore = true),
            @Mapping(target = "lastUpdateDate", ignore = true),
            @Mapping(target = "id", ignore = true)
        })
    NewsModel newsDtoToModel(NewsDtoRequest news);

}
