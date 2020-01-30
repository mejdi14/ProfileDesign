package com.example.profiledesign.models;

public class Photo {
    private int image;
    private String title;

    public Photo(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "image=" + image +
                ", title='" + title + '\'' +
                '}';
    }
}
