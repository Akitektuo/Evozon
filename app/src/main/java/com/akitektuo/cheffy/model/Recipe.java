package com.akitektuo.cheffy.model;

/**
 * Created by PC on 4/1/2017.
 */

public class Recipe {
    private int id;
    private String name;
    private String content;
    private int duration;
    private String[] ingredients;
    private String[] weights;
    private String picture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getWeights() {
        return weights;
    }

    public void setWeights(String[] weights) {
        this.weights = weights;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
