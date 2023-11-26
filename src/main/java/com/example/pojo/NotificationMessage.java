package com.example.pojo;

import lombok.Data;

@Data
public class NotificationMessage {

    private String title;

    private String content;

    private String from;

    private String to;

    private Boolean isRead;
}
