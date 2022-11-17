package com.example.myproject;

public class Articles {

    String title;
    String body;
    int img;

    public Articles(String title,String body,int img){

        this.title=title;
        this.body=body;
        this.img=img;

    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getImg() {
        return img;
    }
}
