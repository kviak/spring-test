package ru.kviak.spring;

import org.springframework.stereotype.Component;


public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Agony - Yung Lean";
    }
}
