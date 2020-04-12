package com.example.musicalstrucureapp;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RecentlyAddedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create a list of String
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Life Is Good", "Future"));
        songs.add(new Song("MMMBop", "Hanson"));
        songs.add(new Song("Physical", "Dua Lipa"));
        songs.add(new Song("Rockaway Beach", "Ramones"));
        songs.add(new Song("Seasons", "Future Islands"));
        songs.add(new Song("Smells Like Teen Spirit", "Nirvana"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
