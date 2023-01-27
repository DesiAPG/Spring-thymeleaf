package com.example.thymeleaf.Model;

import java.util.Date;

public class Post {
    private int id;
    private String description;
    private String urlImg;
    private Date date;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Post(int id, String description, String urlImg, Date date, String title) {
        this.id = id;
        this.description = description;
        this.urlImg = urlImg;
        this.date = date;
        this.title = title;
    }

    public Post() {
    }
}
