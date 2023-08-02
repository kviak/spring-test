package ru.kviak.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        System.out.println("PLayer");
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(){
        System.out.println("Playing: " + rockMusic.getSong());
        System.out.println("Playing: " + classicalMusic.getSong());
        return ": " + rockMusic.getSong() + ", " + classicalMusic.getSong();
    }
}
