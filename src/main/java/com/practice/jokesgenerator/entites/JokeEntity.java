package com.practice.jokesgenerator.entites;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Entity
public class JokeEntity {
    private String content;

    public JokeEntity(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
