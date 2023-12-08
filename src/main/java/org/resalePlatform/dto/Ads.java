package org.resalePlatform.dto;

public class Ads {

    private Integer count;
    private Ad results;

    public Ads(Integer count, Ad results) {
        this.count = count;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Ad getResults() {
        return results;
    }

    public void setResults(Ad results) {
        this.results = results;
    }
}
