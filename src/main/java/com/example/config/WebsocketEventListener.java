package com.example.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;

@Component
@Slf4j
public class WebsocketEventListener {

    @EventListener
    public void handleWebSocketConnectListener(SessionConnectedEvent event){
    log.info("有新链接");
        System.out.println("新链接");
    }
}
