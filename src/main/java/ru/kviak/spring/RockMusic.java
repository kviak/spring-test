package ru.kviak.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    public String getSong() {
        return "Pulp - Love Ghost";
    }
}
