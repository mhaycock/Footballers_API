package com.shell.Footballers.footballers;

public class Player {

    private String name;
    private int age;
    private String img;
    private int id;
    private String nationality;
    private int overall;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public Player(int id, String name, int age, String nationality, int overall, String img) {
        this.name = name;
        this.age = age;
        this.img = img;
        this.id = id;
        this.nationality = nationality;
        this.overall = overall;
    }
}

