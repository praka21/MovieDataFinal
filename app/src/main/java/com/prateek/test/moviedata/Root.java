package com.prateek.test.moviedata;

import java.util.ArrayList;
import java.util.List;

public class Root {
    private Dates dates;
    private Integer page;
    private List<Result> results = new ArrayList<Result>();
    private Integer totalPages;
    private Integer totalResults;
    public Dates getDates() {
        return dates;
    }
    public void setDates(Dates dates) {
        this.dates = dates;
    }
    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public List<Result> getResults() {
        return results;
    }
    public void setResults(List<Result> results) {
        this.results = results;
    }
    public Integer getTotalPages() {
        return totalPages;
    }
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
    public Integer getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @Override
    public String toString() {
        return "Root{" +
                "dates=" + dates +
                ", page=" + page +
                ", results=" + results +
                ", totalPages=" + totalPages +
                ", totalResults=" + totalResults +
                '}';
    }
}
