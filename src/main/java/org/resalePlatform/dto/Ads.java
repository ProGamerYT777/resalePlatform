package org.resalePlatform.dto;

import java.util.List;

public class Ads {

    private Integer count;
    private List<AdDto> results;

    public Ads(Integer count, List<AdDto> results) {
        this.count = count;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<AdDto> getResults() {
        return results;
    }

    public void setResults(List<AdDto> results) {
        this.results = results;
    }
}
