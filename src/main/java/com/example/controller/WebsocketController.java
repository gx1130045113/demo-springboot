package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.entity.Notice;
import com.example.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@RestController
public class WebsocketController {

    //private final SimpUserRegistry simpUserRegistry;

    private static final ConcurrentHashMap<String, Object> respPool = new ConcurrentHashMap<>();

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private NoticeService noticeService;



/*    @MessageMapping("/notify")
    public void notify(NotificationMessage message) {
        // 处理通知逻辑，包括将消息发送给订阅者和保存到数据库
        Notice notice = new Notice();
        notice.setFrom(message.getFrom());
        notice.setContent(message.getContent());
        notice.setIsRead(false);
        //对象存到数据库

        messagingTemplate.convertAndSend("/topic/notifications", notice);
    }*/

    @GetMapping("/all")
    public List<Notice> getAllNotifications() {
        // Assuming you have a service or repository to fetch notifications
        // For simplicity, creating a dummy list
        LambdaQueryWrapper<Notice> noticeLambdaQueryWrapper = new LambdaQueryWrapper<>();
        noticeLambdaQueryWrapper.eq(Notice::getToId,2L);
        List<Notice> list = noticeService.list(noticeLambdaQueryWrapper);
        return list;
    }


    @MessageMapping("/notify")
    @SendTo("/topic/notifications")
    public String sendNotification(String message) {
        return message;
    }
}
