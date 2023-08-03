package ru.kviak.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:musicPlayer.properties")
@ComponentScan("ru.kviak.spring")
@Configuration
public class SpringConfig {
}
