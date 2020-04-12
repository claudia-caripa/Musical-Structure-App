package com.example.musicalstrucureapp;

public class Song {
    /**Song's name */
    private String mSongName;

    /**Artist name*/
    private String mArtistName;

    /**
     * Create a new Song object
     * @param songName
     * @param artistName
     */

    public Song (String songName, String artistName){
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Get the name of the song
     * @return
     */
    public String getSongName() {return mSongName;}


    /**
     * Get the name of the artist
     * @return
     */
    public  String getArtistName() {return mArtistName;}
}
