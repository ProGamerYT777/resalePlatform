package org.resalePlatform.service;

import org.resalePlatform.dto.AdDto;
import org.resalePlatform.dto.Ads;
import org.springframework.web.multipart.MultipartFile;

public interface AdService {

    Ads getAllAds();

    AdDto addAd(AdDto adDto, MultipartFile image);

    AdDto getAds(Integer id);

    AdDto removeAd(Integer id);

    AdDto updateAds(Integer id, AdDto adDto);

    Ads getAdsMe();

    AdDto updateImage(Integer id, MultipartFile image);

}
