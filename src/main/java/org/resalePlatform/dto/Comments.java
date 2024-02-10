package org.resalePlatform.dto;

import java.util.List;

public class Comments {

    private Integer count;
    private List<CommentDto> results;

    public Comments(Integer count, List<CommentDto> results) {
        this.count = count;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<CommentDto> getResults() {
        return results;
    }

    public void setResults(List<CommentDto> results) {
        this.results = results;
    }
}
