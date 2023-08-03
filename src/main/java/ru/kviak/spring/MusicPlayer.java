package ru.kviak.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class MusicPlayer {
    private ArrayList<Music> musicTypeList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(MusicTypes musicTypes) {
        this.musicTypeList = musicTypes.getMusicTypeList();
    }

    public String playMusic(){
        Music music = musicTypeList.get((int) (Math.random() * 3));
        return ": " + music.getSong() +" " + music.getType() + " Player name:" + " " + name + ", Volume: " + volume;
    }
}
