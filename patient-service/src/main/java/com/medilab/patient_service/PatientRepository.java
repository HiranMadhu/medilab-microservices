package com.medilab.patient_service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medilab.patient_service.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    
}
