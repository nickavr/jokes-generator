package com.practice.jokesgenerator.controllers;

import com.practice.jokesgenerator.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(@Qualifier("jokeServiceImpl") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping
    public String getRandomJoke(Model model){
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "jokes/element";
    }
}
