package ru.kviak.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private final Music music1, music2, music3;
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

    public MusicPlayer(@Qualifier("rockMusic")Music music1, @Qualifier("rapMusic") Music music2, @Qualifier("classicalMusic")Music music3 ) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(MusicType type){
        switch (type) {
            case ROCK -> { return ": " + music1.getSong() + " ("+type+")" + " Player name:" + " " + name + ", Volume: " + volume;
            }
            case RAP -> { return  ": " + music2.getSong() + " ("+type+")"+ " Player name:" + " " + name + ", Volume: " + volume;
            }
            case CLASSICAL -> { return  ": " + music3.getSong() + " ("+type+")"+ " Player name:" + " " + name + ", Volume: " + volume;
            }
        }
        return ": nothing play"+ " Player name:" + " " + name + ", Volume: " + volume;
    }
}
