package com.moli.entity;

public class Person {
    private String name;
    private int imageId;
    private String word;
    private String time;

    public Person(String name, int imageId, String word, String time) {
        this.name = name;
        this.imageId = imageId;
        this.word = word;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getWord() {
        return word;
    }

    public String getTime() {
        return time;
    }
}
