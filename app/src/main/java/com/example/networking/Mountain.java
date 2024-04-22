package com.example.networking;

@SuppressWarnings("WeakerAccess")
public class Mountain {

    private String name;
    private String location;
    private int height;

    public Mountain() {
        this.name = "Saknar namn";
        this.location = "Saknar plats";
        this.height = 1;
    }

    public Mountain(String n, String l, int h) {
        this.name = n;
        this.location = l;
        this.height = h;
    }

    public String info() {
        String tmp = new String();
        tmp+= name + "is located in mountain range" + location + " and reaches " + height +   "m above sea level";
        return tmp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return name;
    }

}