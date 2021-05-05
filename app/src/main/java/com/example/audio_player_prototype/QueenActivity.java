package com.example.audio_player_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class QueenActivity extends AppCompatActivity {

    ArrayList<Song> songList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        songList.add(new Song("Action This Day", "Queen", "3:15"));
        songList.add(new Song("Coming Soon", "Queen", "3:25"));
        songList.add(new Song("Dear Friends", "Queen", "4:05"));
        songList.add(new Song("Delilah", "Queen", "3:37"));
        songList.add(new Song("Drowse", "Queen", "3:48"));
        songList.add(new Song("Love kills", "Queen", "3:29"));
        songList.add(new Song("Misfire", "Queen", "4:15"));
        songList.add(new Song("The night comes", "Queen", "3:23"));

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
