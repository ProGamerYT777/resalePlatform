package org.resalePlatform.service.impl;

import lombok.RequiredArgsConstructor;
import org.resalePlatform.dto.AdDto;
import org.resalePlatform.dto.Ads;
import org.resalePlatform.repository.AdRepository;
import org.resalePlatform.service.AdService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Transactional
@RequiredArgsConstructor
@Service
public class AdServiceImpl implements AdService {

    private final AdRepository adRepository;

    public AdServiceImpl(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @Override
    public Ads getAllAds() {
        return null;
    }

    @Override
    public Ads addAd(Ads ad, MultipartFile image) {
        return null;
    }

    @Override
    public Ads getAds(Integer id) {
        return null;
    }

    @Override
    public AdDto removeAd(Integer id) {
        return null;
    }

    @Override
    public AdDto updateAds(Integer id, AdDto adDto) {
        return null;
    }

    @Override
    public Ads getAdsMe() {
        return null;
    }

    @Override
    public AdDto updateImage(Integer id, MultipartFile image) {
        return null;
    }
}
