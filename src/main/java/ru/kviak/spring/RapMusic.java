package ru.kviak.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RapMusic implements Music{
    private List<String> arrayList = new ArrayList<>(Arrays.asList("Agony – Yung Lean", "Reminder - The Weeknd", "Cardio - LILDRUGHILL"));
    @Override
    public String getSong() {
        return arrayList.get((int) (Math.random() * 3));
    }
}
