package org.resalePlatform.dto;

import java.util.List;

public class Comments {

    private Integer count;
    private List<Comment> results;

    public Comments(Integer count, List<Comment> results) {
        this.count = count;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Comment> getResults() {
        return results;
    }

    public void setResults(List<Comment> results) {
        this.results = results;
    }
}
