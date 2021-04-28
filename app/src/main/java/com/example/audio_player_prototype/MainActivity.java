package com.example.audio_player_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create list of albums
        ArrayList<String> albumList = new ArrayList<>();
        albumList.add("ABBA");
        albumList.add("Queen");
        albumList.add("Metallica");

        //set album adaptor to gridView
        AlbumAdapter adapter = new AlbumAdapter(this, albumList);
        GridView albumGrid = findViewById(R.id.grid);
        albumGrid.setAdapter(adapter);

        albumGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent abbaActivity = new Intent(getApplicationContext(), AbbaActivity.class);
                Intent queenActivity = new Intent(getApplicationContext(), QueenActivity.class);
                Intent metallicaActivity = new Intent(getApplicationContext(), MetallicaActivity.class);
                //send intent based on a position in the list of the clicked grid item
                switch (position) {
                    case 0:
                        startActivity(abbaActivity);
                        break;
                    case 1:
                        startActivity(queenActivity);
                        break;
                    case 2:
                        startActivity(metallicaActivity);
                        break;
                }

            }
        });



    }
}