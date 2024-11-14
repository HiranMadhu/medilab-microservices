package com.medilab.aggregator_service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataFetcherService {

    private final RestTemplate restTemplate;

    public DataFetcherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object fetchAppointments() {
        // URL to fetch appointment data
        String appointmentUrl = "http://appointment-service:8082/appointments";
        return restTemplate.getForObject(appointmentUrl, Object.class);
    }

    public Object fetchPatients() {
        // URL to fetch patient data
        String patientUrl = "http://patient-service:8081/patients";
        return restTemplate.getForObject(patientUrl, Object.class);
    }
}
