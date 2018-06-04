package com.mohnage7.jokedisplaylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView jokeTxtView = findViewById(R.id.joke_txt_view);


        String joke = getJoke();
        jokeTxtView.setText(joke);

    }

    private String getJoke() {
        Intent intent = getIntent();
        if (intent.hasExtra(JOKE_EXTRA))
            return intent.getStringExtra(JOKE_EXTRA);
        else return "";
    }

}
