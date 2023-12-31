package ru.kviak.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music{
    private final List<String> arrayList = new ArrayList<>(Arrays.asList("Pulp - Love Ghost", "Garbage Trick - Sex Bob-Omb", "screws - ThxSoMch"));
    @Override
    public String getSong() {
        return arrayList.get((int) (Math.random() * 3));
    }

    @Override
    public String getType() {
        return "(Rock Music)";
    }
}
