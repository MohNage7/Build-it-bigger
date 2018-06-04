package com.udacity.gradle.builditbigger.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyJoke {

    private String joke;

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

}