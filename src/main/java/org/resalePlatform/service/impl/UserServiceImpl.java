package org.resalePlatform.service.impl;

import lombok.RequiredArgsConstructor;
import org.resalePlatform.dto.NewPassword;
import org.resalePlatform.dto.UserDto;
import org.resalePlatform.repository.UserRepository;
import org.resalePlatform.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Transactional
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto setPassword(NewPassword password) {
        return null;
    }

    @Override
    public UserDto getUser() {
        return null;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto updateUserImage(MultipartFile image) {
        return null;
    }
}
