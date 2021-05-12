package com.example.audio_player_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_activity);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //disable landscape mode

        Intent intent = getIntent();
        String[] extras = intent.getExtras().getStringArray("SONG_ATTRIBUTES");

        TextView songTitle = findViewById(R.id.song_title_player);
        songTitle.setText(extras[0]);

        TextView artist = findViewById(R.id.artist_name);
        artist.setText(extras[1]);
    }
}