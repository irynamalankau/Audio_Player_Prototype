package com.example.audio_player_prototype;

public class Song {

    private String mSongTitle;

    private String mArtist;

    private String mSongDuration;

    public Song(String songTitle, String artist, String songDuration){
        mSongTitle = songTitle;
        mArtist = artist;
        mSongDuration = songDuration;
    }

    public String getSongTitle(){
        return mSongTitle;
    }

    public String getArtist(){
        return mArtist;
    }

    public String getSongDuration(){
        return mSongDuration;

    }


}

