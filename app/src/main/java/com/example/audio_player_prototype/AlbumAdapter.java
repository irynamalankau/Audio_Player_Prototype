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
import java.util.List;

public class AlbumAdapter extends ArrayAdapter<String> {

    public AlbumAdapter(@NonNull Context context, ArrayList<String> albums) {
        super(context, 0, albums);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        // Get the {@link Album} object located at this position in the list
        String currentAlbum = getItem(position);

        // Find the TextView in the grid_item.xml layout with the ID album
        TextView albumTextView = listItemView.findViewById(R.id.album);

        //get album name of the current Album object and set the textView
        albumTextView.setText(currentAlbum);



        return listItemView;
    }

}

