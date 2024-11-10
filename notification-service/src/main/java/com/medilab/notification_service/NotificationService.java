package com.medilab.notification_service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public String sendNotification(String message) {
        // Logic for sending a notification
        return "Notification sent: " + message;
    }
}
