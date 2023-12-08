package org.resalePlatform.controller;

import com.foreach.openapi.model.Ads;
import lombok.extern.slf4j.Slf4j;
import org.resalePlatform.service.AdService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
public class AdController {

    private final AdService adService;

    public AdController(AdService adService) {
        this.adService = adService;
    }

    @GetMapping("/ads")
    public ResponseEntity<Ads> getAllAds() {
        return null;
    }

    @PostMapping(value = "/ads", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Ads> addAd(@RequestBody Ads ad, @RequestParam("image") MultipartFile image) {
        return null;
    }

    @GetMapping("/ads/{id}")
    public ResponseEntity<Ads> getAds(@PathVariable("id") Integer id) {
        return null;
    }

    @DeleteMapping("/ads/{id}")
    public ResponseEntity<Ads> removeAd(@PathVariable("id") Integer id) {
        return null;
    }

    @PatchMapping("/ads/{id}")
    public ResponseEntity<Ads> updateAds(@PathVariable("id") Integer id, @RequestBody Ads ad) {
        return null;
    }

    @GetMapping("/ads/me")
    public ResponseEntity<Ads> getAdsMe() {
        return null;
    }

    @PatchMapping(value = "/ads/{id}/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Ads> updateImage(@RequestParam("image") MultipartFile image, @PathVariable("id") Integer id) {
        return null;
    }
}
