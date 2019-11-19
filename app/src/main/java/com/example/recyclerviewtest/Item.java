package com.example.recyclerviewtest;

public class Item {
    private int imageResource;
    private String firstText;
    private String secondText;

    public Item(int imageResource, String firstText, String secondText) {
        this.imageResource = imageResource;
        this.firstText = firstText;
        this.secondText = secondText;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getFirstText() {
        return firstText;
    }

    public void setFirstText(String firstText) {
        this.firstText = firstText;
    }

    public String getSecondText() {
        return secondText;
    }

    public void setSecondText(String secondText) {
        this.secondText = secondText;
    }
}
