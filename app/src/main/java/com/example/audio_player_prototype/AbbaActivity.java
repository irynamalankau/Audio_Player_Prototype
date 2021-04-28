package com.example.audio_player_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class AbbaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //create lists of songs
        ArrayList<Song> songListAbba = new ArrayList<>();
        songListAbba.add(new Song("The visitors", "ABBA", "5:47"));
        songListAbba.add(new Song("When all is sad and done", "ABBA", "3:18"));
        songListAbba.add(new Song("I let the music speak", "ABBA", "5:21"));
        songListAbba.add(new Song("Two for the price of one", "ABBA", "3:38"));
        songListAbba.add(new Song("Head over heals", "ABBA", "3:48"));
        songListAbba.add(new Song("Soldiers", "ABBA", "4:41"));
        songListAbba.add(new Song("One of us", "ABBA", "3:57"));
        songListAbba.add(new Song("Slipping through my fingers", "ABBA", "3:54"));

        //set song adapter to the list
        SongAdapter adapter = new SongAdapter(this, songListAbba);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

        //send intent to open player when song is clicked
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //array of song attributes (title and artist) to pass with intent
                String[] songAttr = {songListAbba.get(position).getSongTitle(), songListAbba.get(position).getArtist()};
                //create intent
                Intent player = new Intent(getApplicationContext(), PlayerActivity.class);
                //pass song attributes as extra to intent
                player.putExtra("SONG_ATTRIBUTES", songAttr);
                startActivity(player);
            }
        });


    }
}
