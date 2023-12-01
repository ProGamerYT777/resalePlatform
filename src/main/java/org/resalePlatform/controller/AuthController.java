package org.resalePlatform.controller;

import com.foreach.openapi.model.Ads;
import com.foreach.openapi.model.Comments;
import com.foreach.openapi.model.User;
import lombok.extern.slf4j.Slf4j;
import org.resalePlatform.dto.Login;
import org.resalePlatform.dto.Register;
import org.resalePlatform.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Login login) {
        if (authService.login(login.getUsername(), login.getPassword())) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Register register) {
        if (authService.register(register)) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PostMapping("/users/set_password")
    public ResponseEntity<User> setPassword() {
        return null;
    }
    @GetMapping("/users/me")
    public ResponseEntity<User> getUser() {
        return null;
    }

    @PatchMapping("/users/me")
    public ResponseEntity<User> updateUser() {
        return null;
    }

    @PatchMapping("/users/me/image")
    public ResponseEntity<User> updateUserImage() {
        return null;
    }

    @GetMapping("/ads")
    public ResponseEntity<Ads> getAllAds() {
        return null;
    }

    @PostMapping("/ads")
    public ResponseEntity<Ads> addAd() {
        return null;
    }

    @GetMapping("/ads/{id}/comments")
    public ResponseEntity<Comments> getComments(@PathVariable Integer id) {
        return null;
    }

    @PostMapping("/ads/{id}/comments")
    public ResponseEntity<Comments> addComment(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("/ads/{id}")
    public ResponseEntity<Ads> getAds(@PathVariable Integer id) {
        return null;
    }

    @DeleteMapping("/ads/{id}")
    public ResponseEntity<Ads> removeAd(@PathVariable Integer id) {
        return null;
    }

    @PatchMapping("/ads/{id}")
    public ResponseEntity<Ads> updateAds(@PathVariable Integer id) {
        return null;
    }

    @DeleteMapping("/ads/{adId}/comments/{commentId}")
    public ResponseEntity<Comments> deleteComment(@PathVariable Integer adId, @PathVariable Integer commentId) {
        return null;
    }

    @PatchMapping("/ads/{adId}/comments/{commentId}")
    public ResponseEntity<Comments> updateComment(@PathVariable Integer adId, @PathVariable Integer commentId) {
        return null;
    }

    @GetMapping("/ads/me")
    public ResponseEntity<Ads> getAdsMe() {
        return null;
    }

    @PatchMapping("/ads/{id}/image")
    public ResponseEntity<Ads> updateImage(@PathVariable Integer id) {
        return null;
    }
}