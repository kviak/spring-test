package ru.kviak.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;

@PropertySource("classpath:musicPlayer.properties")
@Configuration
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public MusicTypes musicTypes(){
        return new MusicTypes(new ArrayList<>(Arrays.asList(rapMusic(), rockMusic(), classicalMusic())));
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicTypes());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
