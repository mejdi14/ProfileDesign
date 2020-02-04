package com.example.profiledesign.models;

public class TwoPhotos {
    private int firstImage;
    private int secondImage;

    public TwoPhotos(int firstImage, int secondImage) {
        this.firstImage = firstImage;
        this.secondImage = secondImage;
    }

    public int getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(int firstImage) {
        this.firstImage = firstImage;
    }

    public int getSecondImage() {
        return secondImage;
    }

    public void setSecondImage(int secondImage) {
        this.secondImage = secondImage;
    }
}
