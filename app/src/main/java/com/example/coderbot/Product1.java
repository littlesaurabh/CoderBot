package com.example.coderbot;

public class Product1 {

    private String image;
    private String title;
    private String detail;

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    private  String blog;


    public Product1(){

    }

    public Product1(String image, String title, String detail,String blog) {
        this.image = image;
        this.title = title;
        this.detail=detail;
        this.blog=blog;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
    public String getDetail() {
        return detail;
    }


}