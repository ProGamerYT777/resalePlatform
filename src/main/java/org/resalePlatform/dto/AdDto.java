package org.resalePlatform.dto;

import org.resalePlatform.entity.Ad;
import org.resalePlatform.entity.User;

public class AdDto {

    private User author;
    private String image;
    private Integer pk;
    private Integer price;
    private String title;

    public AdDto(User author, String image, Integer pk, Integer price, String title) {
        this.author = author;
        this.image = image;
        this.pk = pk;
        this.price = price;
        this.title = title;
    }

    public AdDto() {

    }

    public static AdDto fromAd(Ad ad) {
        AdDto adDto = new AdDto();
        adDto.setAuthor(ad.getAuthor());
        adDto.setImage(ad.getImage());
        adDto.setPk(ad.getPk());
        adDto.setPrice(ad.getPrice());
        adDto.setTitle(ad.getTitle());
        return adDto;
    }

    public static Ad toAd(AdDto adDto) {
        Ad ad =  new Ad();
        ad.setAuthor(adDto.getAuthor());
        ad.setImage(adDto.getImage());
        ad.setPk(adDto.getPk());
        ad.setPrice(adDto.getPrice());
        ad.setTitle(adDto.getTitle());
        return ad;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "AdDto{" +
                "author=" + author +
                ", image='" + image + '\'' +
                ", pk=" + pk +
                ", price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}
