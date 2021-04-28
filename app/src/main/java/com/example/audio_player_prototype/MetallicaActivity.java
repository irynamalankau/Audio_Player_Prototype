package com.example.audio_player_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class MetallicaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create lists of songs
        ArrayList<Song> songListMetallica = new ArrayList<Song>();

        songListMetallica.add(new Song("Action This Day", "Metallica", "3:15"));
        songListMetallica.add(new Song("Coming Soon", "Metallica", "3:25"));
        songListMetallica.add(new Song("Dear Friends", "Metallica", "4:05"));
        songListMetallica.add(new Song("Delilah", "Metallica", "3:37"));
        songListMetallica.add(new Song("Drowse", "Metallica", "3:48"));
        songListMetallica.add(new Song("Love kills", "Metallica", "3:29"));
        songListMetallica.add(new Song("Misfire", "Metallica", "4:15"));
        songListMetallica.add(new Song("The night comes", "Metallica", "3:23"));

        //set song adapter to the list
        SongAdapter adapter = new SongAdapter(this, songListMetallica);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);



    }
}

