package com.udacity.gradle.builditbigger.backend;

import com.mohnage7.jokefactorylibrary.Joker;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyJoke {


    public String getJoke() {
        return new Joker().getRandomJokeJoke();
    }

}