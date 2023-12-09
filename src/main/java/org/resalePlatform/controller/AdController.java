package org.resalePlatform.controller;

import lombok.extern.slf4j.Slf4j;
import org.resalePlatform.dto.Ad;
import org.resalePlatform.dto.Ads;
import org.resalePlatform.service.AdService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RequestMapping("/ads")
@RestController
public class AdController {

    private final AdService adService;

    public AdController(AdService adService) {
        this.adService = adService;
    }

    @GetMapping("/")
    public ResponseEntity<Ads> getAllAds() {
        return null;
    }

    @PostMapping(value = "/", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Ads> addAd(@RequestBody Ads ad, @RequestPart("image") MultipartFile image) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ads> getAds(@PathVariable("id") Integer id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Ad> removeAd(@PathVariable("id") Integer id) {
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Ad> updateAds(@PathVariable("id") Integer id, @RequestBody Ad ad) {
        return null;
    }

    @GetMapping("/me")
    public ResponseEntity<Ads> getAdsMe() {
        return null;
    }

    @PatchMapping(value = "/{id}/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Ad> updateImage(@RequestPart("image") MultipartFile image, @PathVariable("id") Integer id) {
        return null;
    }
}
