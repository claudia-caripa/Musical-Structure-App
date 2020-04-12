package com.example.musicalstrucureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the recently added category
        TextView recentlyAdd = (TextView) findViewById(R.id.recently_added);

        recentlyAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recentlyAddedIntent = new Intent(MainActivity.this, RecentlyAddedActivity.class);

                startActivity(recentlyAddedIntent);
            }
        });

        // Find the View that shows the playlist category
        TextView playlist = (TextView) findViewById(R.id.playlist);

        playlist.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the all songs category
        TextView allSongs = (TextView) findViewById(R.id.all_songs);

        allSongs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allSongsIntent = new Intent(MainActivity.this, AllSongsActivity.class);

                startActivity(allSongsIntent);
            }
        });

        Button playButton = (Button) findViewById(R.id.play_button);
        playButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "Playing your favourite song";
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });


    }

}






