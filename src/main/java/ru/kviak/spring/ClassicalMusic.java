package ru.kviak.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    public ClassicalMusic() {
        System.out.println("Music");
    }

    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }
}
