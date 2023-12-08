package org.resalePlatform.dto;

public class Comments {

    private Integer count;
    private Comment results;

    public Comments(Integer count, Comment results) {
        this.count = count;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Comment getResults() {
        return results;
    }

    public void setResults(Comment results) {
        this.results = results;
    }
}
