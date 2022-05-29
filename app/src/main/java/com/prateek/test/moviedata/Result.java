package com.prateek.test.moviedata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Result implements Serializable {
    private Boolean adult;
    private String backdrop_path;
    private List<Integer> genreIds = new ArrayList<Integer>();
    private Integer id;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private Double popularity;
    private String poster_path;
    private String releaseDate;
    private String title;
    private Boolean video;
    private Integer voteAverage;
    private Integer voteCount;
    public Boolean getAdult() {
        return adult;
    }
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }
    public String getBackdropPath() {
        return backdrop_path;
    }
    public void setBackdropPath(String backdropPath) {
        this.backdrop_path = backdropPath;
    }
    public List<Integer> getGenreIds() {
        return genreIds;
    }
    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getOriginalLanguage() {
        return originalLanguage;
    }
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }
    public String getOriginalTitle() {
        return originalTitle;
    }
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
    public String getOverview() {
        return overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }
    public Double getPopularity() {
        return popularity;
    }
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }
    public String getPosterPath() {
        return poster_path;
    }
    public void setPosterPath(String posterPath) {
        this.poster_path = posterPath;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Boolean getVideo() {
        return video;
    }
    public void setVideo(Boolean video) {
        this.video = video;
    }
    public Integer getVoteAverage() {
        return voteAverage;
    }
    public void setVoteAverage(Integer voteAverage) {
        this.voteAverage = voteAverage;
    }
    public Integer getVoteCount() {
        return voteCount;
    }
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public String toString() {
        return "Result{" +
                "adult=" + adult +
                ", backdropPath='" + backdrop_path + '\'' +
                ", genreIds=" + genreIds +
                ", id=" + id +
                ", originalLanguage='" + originalLanguage + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                ", posterPath='" + poster_path + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", title='" + title + '\'' +
                ", video=" + video +
                ", voteAverage=" + voteAverage +
                ", voteCount=" + voteCount +
                '}';
    }
}

