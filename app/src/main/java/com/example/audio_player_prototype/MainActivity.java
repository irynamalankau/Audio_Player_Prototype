package com.example.audio_player_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //list of albums for GridView
    private ArrayList<String> albumList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //disable landscape mode

        albumList.add("ABBA");
        albumList.add("Queen");
        albumList.add("Metallica");
        albumList.add("Chicago");

        //set album adaptor to GridView
        AlbumAdapter adapter = new AlbumAdapter(this, albumList);
        GridView albumGrid = findViewById(R.id.grid);
        albumGrid.setAdapter(adapter);

        albumGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent abbaActivity = new Intent(getApplicationContext(), AbbaActivity.class);
                Intent queenActivity = new Intent(getApplicationContext(), QueenActivity.class);
                Intent metallicaActivity = new Intent(getApplicationContext(), MetallicaActivity.class);
                Intent chicagoActivity = new Intent(getApplicationContext(), ChicagoActivity.class);
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
                    case 3:
                        startActivity(chicagoActivity);
                        break;
                }

            }
        });
    }
}