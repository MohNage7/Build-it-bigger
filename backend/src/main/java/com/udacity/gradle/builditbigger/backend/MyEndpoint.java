package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.mohnage7.jokefactorylibrary.Joker;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint that returns random joke
     */
    @ApiMethod(name = "getJoke")
    public MyJoke getJoke() {
        // init object from java lib
        Joker joker = new Joker();
        // init ref from MyJoke bean
        MyJoke myJoke = new MyJoke();
        // set MyJoke value
        myJoke.setJoke(joker.getRandomJokeJoke());
        return myJoke;
    }

}
