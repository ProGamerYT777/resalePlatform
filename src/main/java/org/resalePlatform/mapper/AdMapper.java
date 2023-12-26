package org.resalePlatform.mapper;

import org.mapstruct.Mapper;
import org.resalePlatform.dto.AdDto;
import org.resalePlatform.entity.Ad;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AdMapper {

    Ad toEntity(AdDto adDto);

    AdDto toDto(Ad ad);

}
