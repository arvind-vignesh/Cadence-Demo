package com.training.training;

public class Training {
    private String url;
    private String CourseName;

    public Training(String url, String courseName) {
        this.url = url;
        CourseName = courseName;
    }

    public Training() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
}
