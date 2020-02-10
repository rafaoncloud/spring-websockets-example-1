package com.websockets.demo.messagingstompwebsockets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    @Autowired
    private SimpMessagingTemplate template;

    @Scheduled(fixedRate = 2000)
    public void fireGreeting() {
        this.template.convertAndSend("/topic/greetings", new Greeting("Hello, Scheduled - Fire rate of 2 seconds!"));
    }
}
