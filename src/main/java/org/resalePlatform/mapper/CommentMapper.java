package org.resalePlatform.mapper;

import org.mapstruct.Mapper;
import org.resalePlatform.dto.CommentDto;
import org.resalePlatform.entity.Comment;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CommentMapper {

    Comment toEntity(CommentDto commentDto);

    CommentDto toDto(Comment comment);

}
