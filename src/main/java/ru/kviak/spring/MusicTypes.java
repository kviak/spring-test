package ru.kviak.spring;

import java.util.ArrayList;

public class MusicTypes {
    private ArrayList<Music> musicTypeList;

    public MusicTypes(ArrayList<Music> musicTypeList) {
        this.musicTypeList = musicTypeList;
    }

    public ArrayList<Music> getMusicTypeList() {
        return musicTypeList;
    }
}
