package com.example.audio_player_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class QueenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create lists of songs
        ArrayList<Song> songListQueen = new ArrayList<Song>();

        songListQueen.add(new Song("Action This Day", "Queen", "3:15"));
        songListQueen.add(new Song("Coming Soon", "Queen", "3:25"));
        songListQueen.add(new Song("Dear Friends", "Queen", "4:05"));
        songListQueen.add(new Song("Delilah", "Queen", "3:37"));
        songListQueen.add(new Song("Drowse", "Queen", "3:48"));
        songListQueen.add(new Song("Love kills", "Queen", "3:29"));
        songListQueen.add(new Song("Misfire", "Queen", "4:15"));
        songListQueen.add(new Song("The night comes", "Queen", "3:23"));

        //set song adapter to the list
        SongAdapter adapter = new SongAdapter(this, songListQueen);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
