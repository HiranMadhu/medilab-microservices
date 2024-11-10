package com.medilab.appointment_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

    @GetMapping("/appointments")
    public String getAppointments() {
        return "List of appointments";
    }
}
