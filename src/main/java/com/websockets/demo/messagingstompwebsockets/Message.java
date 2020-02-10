package com.websockets.demo.messagingstompwebsockets;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Message {

    private String name;

    @JsonCreator
    public Message(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
