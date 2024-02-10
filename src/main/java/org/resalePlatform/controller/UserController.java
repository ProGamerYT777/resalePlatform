package org.resalePlatform.controller;

import lombok.extern.slf4j.Slf4j;
import org.resalePlatform.dto.NewPassword;
import org.resalePlatform.dto.UserDto;
import org.resalePlatform.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RequestMapping("/users")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/set_password")
    public ResponseEntity<UserDto> setPassword(@RequestBody NewPassword password) {
        return ResponseEntity.ok(userService.setPassword(password));
    }
    @GetMapping("/me")
    public ResponseEntity<UserDto> getUser() {
        return ResponseEntity.ok(userService.getUser());
    }

    @PatchMapping("/me")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.updateUser(userDto));
    }

    @PatchMapping(value = "/me/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<UserDto> updateUserImage(@RequestPart("image") MultipartFile image) {
        return ResponseEntity.ok(userService.updateUserImage(image));
    }
}
