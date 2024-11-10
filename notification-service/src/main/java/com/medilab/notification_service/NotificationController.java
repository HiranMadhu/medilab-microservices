package com.medilab.notification_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @GetMapping("/status")
    public String getStatus() {
        return "Notification Service is up and running!";
    }
}
