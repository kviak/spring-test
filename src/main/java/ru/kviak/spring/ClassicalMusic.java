package ru.kviak.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private List<String> arrayList = new ArrayList<>(Arrays.asList("Mozart – Eine kleine Nachtmusik", "Beethoven – Für Elise", "Puccini – 'O mio babbino caro' from Gianni Schicchi"));
    @Override
    public String getSong() {
        return arrayList.get((int) (Math.random() * 3));
    }
}
