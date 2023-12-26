package org.resalePlatform.controller;

import lombok.extern.slf4j.Slf4j;
import org.resalePlatform.dto.AdDto;
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
        return ResponseEntity.ok(adService.getAllAds());
    }

    @PostMapping(value = "/", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Ads> addAd(@RequestPart("properties") Ads ad, @RequestPart("image") MultipartFile image) {
        return ResponseEntity.ok(adService.addAd(ad, image));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ads> getAds(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(adService.getAds(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AdDto> removeAd(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(adService.removeAd(id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<AdDto> updateAds(@PathVariable("id") Integer id, @RequestBody AdDto adDto) {
        return ResponseEntity.ok(adService.updateAds(id, adDto));
    }

    @GetMapping("/me")
    public ResponseEntity<Ads> getAdsMe() {
        return ResponseEntity.ok(adService.getAdsMe());
    }

    @PatchMapping(value = "/{id}/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<AdDto> updateImage(@PathVariable("id") Integer id, @RequestPart("image") MultipartFile image) {
        return ResponseEntity.ok(adService.updateImage(id, image));
    }
}
