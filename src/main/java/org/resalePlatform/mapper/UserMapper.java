package org.resalePlatform.mapper;

import org.mapstruct.Mapper;
import org.resalePlatform.dto.UserDto;
import org.resalePlatform.entity.User;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {

    User toEntity(UserDto userDto);

    UserDto toDto(User user);

}
