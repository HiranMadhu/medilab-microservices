package com.medilab.aggregator_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class AggregatorController {

    @Autowired
    private RestTemplate restTemplate;

    // Endpoint to manually trigger data aggregation
    @GetMapping("/aggregate")
    public String aggregateData() {
        // Fetch patient and appointment data from other services
        List<Object> patients = restTemplate.getForObject("http://patients-service:8081/patients", List.class);
        List<Object> appointments = restTemplate.getForObject("http://appointment-service:8082/appointments", List.class);

        // Aggregation logic
        int totalAppointments = appointments.size();
        int totalPatients = patients.size();

        // For example, log the aggregated data
        System.out.println("Total Appointments: " + totalAppointments);
        System.out.println("Total Patients: " + totalPatients);

        return "Aggregation complete: " + totalAppointments + " appointments, " + totalPatients + " patients.";
    }

    // Scheduled job to aggregate data at regular intervals (e.g., every hour)
    @Scheduled(fixedRate = 3600000) // 3600000 ms = 1 hour
    public void scheduledAggregation() {
        aggregateData(); // Call the aggregateData method
    }
}
