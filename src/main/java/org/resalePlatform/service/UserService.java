package org.resalePlatform.service;

import org.resalePlatform.dto.NewPassword;
import org.resalePlatform.dto.UserDto;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

    UserDto setPassword(NewPassword password);

    UserDto getUser();

    UserDto updateUser(UserDto userDto);

    UserDto updateUserImage(MultipartFile image);

}
