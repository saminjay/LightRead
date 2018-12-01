package com.example.alienware.mlh;

public class Article {
    private String title;
    private int image;
    private String url;

    Article(String title, int image, String url){
        this.title = title;
        this.image = image;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getUrl() {
        return url;
    }
}
