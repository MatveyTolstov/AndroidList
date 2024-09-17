package com.example.recycle;

public class Cat {
        private String name;

        private  String haracter;

        private int catResource;

    public Cat(String name, String haracter, int catResource) {
        this.name = name;
        this.haracter = haracter;
        this.catResource = catResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHaracter() {
        return haracter;
    }

    public void setHaracter(String haracter) {
        this.haracter = haracter;
    }

    public int getCatResource() {
        return catResource;
    }

    public void setCatResource(int catResource) {
        this.catResource = catResource;
    }
}
