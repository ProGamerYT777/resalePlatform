package org.resalePlatform.controller;

import com.foreach.openapi.model.User;
import lombok.extern.slf4j.Slf4j;
import org.resalePlatform.dto.Login;
import org.resalePlatform.dto.NewPassword;
import org.resalePlatform.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users/set_password")
    public ResponseEntity<User> setPassword(@RequestBody NewPassword password) {
        return null;
    }
    @GetMapping("/users/me")
    public ResponseEntity<User> getUser() {
        return null;
    }

    @PatchMapping("/users/me")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return null;
    }

    @PatchMapping(value = "/users/me/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<User> updateUserImage(@RequestParam("image") MultipartFile image) {
        return null;
    }
}
