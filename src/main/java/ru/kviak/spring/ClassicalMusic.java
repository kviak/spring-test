package ru.kviak.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{

    private final List<String> arrayList = new ArrayList<>(Arrays.asList("Mozart – Eine kleine Nachtmusik", "Beethoven – Für Elise", "Puccini – 'O mio babbino caro' from Gianni Schicchi"));
    @Override
    public String getSong() {
        return arrayList.get((int) (Math.random() * 3));
    }
    @PostConstruct
    private void initMes(){
        System.out.println("PostConstruct method");
    }
    @PreDestroy
    private void destroyMes(){
        System.out.println("PreDestroy");
    }
}
