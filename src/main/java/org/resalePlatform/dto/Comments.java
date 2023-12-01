package org.resalePlatform.dto;

import java.lang.reflect.Array;

public class Comments {

    private Integer count;
    private Array results;

    public Comments(Integer count, Array results) {
        this.count = count;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Array getResults() {
        return results;
    }

    public void setResults(Array results) {
        this.results = results;
    }
}
