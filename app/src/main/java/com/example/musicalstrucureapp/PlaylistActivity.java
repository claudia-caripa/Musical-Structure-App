package com.example.musicalstrucureapp;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_activity);

        //Create a list of String for the  recently added songs
        ArrayList<String> playlist = new ArrayList<String>();

        playlist.add("Christmas Songs");
        playlist.add("Summer Jam");
        playlist.add("90's");
        playlist.add("Top 10 in Ireland");


        //Find LinearLayout for recently added
        LinearLayout playlistView = findViewById(R.id.playlist_view);

        for (int index = 0; index < playlist.size(); index++) {
            TextView playlistTextView = new TextView(this);
            playlistTextView.setText(playlist.get(index));
            playlistTextView.setTextSize(28);
            playlistTextView.setPadding(24,24,24,24);
            playlistView.addView(playlistTextView);
        }
    }
}