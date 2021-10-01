package com.example.fragment.models;
public class Song {
    private String songNumber, songName, singerName, time;

    public Song(String songNumber, String songName, String singerName, String time) {
        this.songNumber = songNumber;
        this.songName = songName;
        this.singerName = singerName;
        this.time = time;
    }

    public String getSongNumber() {
        return songNumber;
    }

    public String getSongName() {
        return songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getTime() {
        return time;
    }
}