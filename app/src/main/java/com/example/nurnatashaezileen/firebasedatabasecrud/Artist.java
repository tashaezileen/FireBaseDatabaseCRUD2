package com.example.nurnatashaezileen.firebasedatabasecrud;

/**
 * Created by Nur Natasha Ezileen on 10/30/2017.
 */

public class Artist {

    String artistId;
    String artistName;


    public Artist(){}

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }


    public String getArtistName() {
        return artistName;
    }

}

