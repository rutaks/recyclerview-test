package com.example.recyclerviewtest;

public class Item {
    private int imageResource;
    private String firstText;
    private String secondText;

    public Item(int imageResource, String firstText, String secondText) {
        this.imageResource = imageResource;
        this.firstText = firstText;
        this.secondText =  secondText;
    }

    void changeFirstText(String firstText){
        this.firstText = firstText;
    }

    int getImageResource() { return imageResource;}

    String getFirstText() {
        return firstText;
    }

    String getSecondText() {
        return secondText;
    }
}
