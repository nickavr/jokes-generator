package com.practice.jokesgenerator.services.implementation;

import com.practice.jokesgenerator.entites.JokeEntity;
import com.practice.jokesgenerator.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    @Override
    public JokeEntity getRandomJoke() {
        return new JokeEntity( new ChuckNorrisQuotes().getRandomQuote());
    }
}
