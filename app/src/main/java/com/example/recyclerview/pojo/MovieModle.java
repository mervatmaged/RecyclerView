package com.example.recyclerview.pojo;

public class MovieModle {
    String name;
    String date;
    String discription;
    int id;

    public MovieModle(String name, String date, String discription, int id) {
        this.name = name;
        this.date = date;
        this.discription = discription;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
