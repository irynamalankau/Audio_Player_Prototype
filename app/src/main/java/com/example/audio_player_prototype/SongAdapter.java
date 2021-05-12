package com.example.audio_player_prototype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(@NonNull Context context, ArrayList<Song> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Song currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID and assign the value
        TextView songTitleTextView = listItemView.findViewById(R.id.song_title);
        songTitleTextView.setText(currentItem.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID artist and assign the value
        TextView artistTextView = listItemView.findViewById(R.id.artist_name);
        artistTextView.setText(currentItem.getArtist());

        // Find the TextView in the list_item.xml layout with the ID duration and assign the value
        TextView durationTextView = listItemView.findViewById(R.id.duration);
        durationTextView.setText(currentItem.getSongDuration());

        return listItemView;
    }
}


