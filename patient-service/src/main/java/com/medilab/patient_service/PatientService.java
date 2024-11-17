package com.medilab.patient_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    // Method to get all patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Method to get a patient by ID
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    // Method to save a new patient
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Method to update an existing patient
    public Patient updatePatient(Long id, Patient patientDetails) {
        Patient patient = patientRepository.findById(id).orElse(null);
        if (patient != null) {
            patient.setName(patientDetails.getName());
            patient.setDisease(patientDetails.getDisease());
            return patientRepository.save(patient);
        }
        return null; // Return null if patient not found
    }

    // Method to delete a patient by ID
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
