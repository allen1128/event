package com.xl.service;

import com.xl.actor.Actor;
import org.springframework.boot.CommandLineRunner;

public interface EventService<V> extends CommandLineRunner {

    void register(Actor<V>... actors);

    @Override
    default public void run(String... args) throws Exception {

    }
}
