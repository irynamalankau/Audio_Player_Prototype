package com.example.audio_player_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class MetallicaActivity extends AppCompatActivity {

    private ArrayList<Song> songList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //disable landscape mode

        songList.add(new Song("All Your Lies", "Metallica", "3:15"));
        songList.add(new Song("Am I Savage?", "Metallica", "3:25"));
        songList.add(new Song("Astronomy", "Metallica", "4:05"));
        songList.add(new Song("Clampdown", "Metallica", "3:37"));
        songList.add(new Song("Devil's Dance", "Metallica", "3:48"));
        songList.add(new Song("Green Hell", "Metallica", "3:29"));
        songList.add(new Song("Junior Dad", "Metallica", "4:15"));
        songList.add(new Song("Overkill", "Metallica", "3:23"));

        //set song adapter to the list
        SongAdapter adapter = new SongAdapter(this, songList);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

        //send intent to open player when song is clicked
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //array of song attributes (title and artist) to pass with intent
                String[] songAttr = {songList.get(position).getSongTitle(), songList.get(position).getArtist()};
                //create intent
                Intent player = new Intent(getApplicationContext(), PlayerActivity.class);
                //pass song attributes as extra to intent
                player.putExtra("SONG_ATTRIBUTES", songAttr);
                startActivity(player);
            }
        });
    }
}

