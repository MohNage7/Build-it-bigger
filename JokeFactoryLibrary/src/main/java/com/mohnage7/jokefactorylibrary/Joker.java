package com.mohnage7.jokefactorylibrary;

import java.util.Random;

public class Joker {
    /**
     * this method returns random joke
     *
     * @return
     */

    private String[] jokesList = new String[]{"Q: When do you go at red and stop at green?\n" +
            "A: When you’re eating a watermelon.", "Knock! Knock!\n" +
            "Who’s there?\n" +
            "A broken pencil.\n" +
            "A broken pencil who?\n" +
            "Never mind, it’s pointless.",
            "ER DOCTOR: So, what brings you here?\n" +
                    "\n" +
                    "PATIENT: An ambulance! What do you think?!",
            "Knock! Knock!\n" +
                    "\n" +
                    "Who’s there?\n" +
                    "\n" +
                    "Howl.\n" +
                    "\n" +
                    "Howl who?\n" +
                    "\n" +
                    "Howl you know if you don't open the door?\n" +
                    "\n",
            "Q:  Why shouldn't you give Elsa a balloon?\n" +
                    "\n" +
                    "A. Because she'll let it go!\n" +
                    "\n"};

    public String getRandomJokeJoke() {
        int randomIndex = new Random().nextInt(jokesList.length);
        return jokesList[randomIndex];
    }
}
