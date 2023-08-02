package ru.kviak.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    Music music1;
    Music music2;
    Music music3;

    public MusicPlayer(@Qualifier("rockMusic")Music music1,@Qualifier("rapMusic") Music music2, @Qualifier("classicalMusic")Music music3 ) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(MusicType type){
        switch (type) {
            case ROCK -> { return ": " + music1.getSong() + " ("+type+")";
            }
            case RAP -> { return  ": " + music2.getSong() + " ("+type+")";
            }
            case CLASSICAL -> { return  ": " + music3.getSong() + " ("+type+")";
            }
        }
        return ": nothing play";
    }
}
