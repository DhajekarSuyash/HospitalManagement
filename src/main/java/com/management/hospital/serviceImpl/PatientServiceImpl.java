package com.management.hospital.serviceImpl;

import com.management.hospital.entity.Patient;
import com.management.hospital.repository.PatientRepository;
import com.management.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient patient) {
        Patient newPatient = patientRepository.save(patient);
        System.err.println("Patient saved successfully");
        return newPatient;
    }

    @Override
    public List<Patient> getAllPatientList() {
        List<Patient> patientList = patientRepository.findAll();
        return patientList;
    }

    @Override
    public Patient getPatientById(int id) {
       Patient patient =  patientRepository.findById(id).orElseThrow(
                () ->  new IllegalArgumentException());
        return patient;
    }

    @Override
    public String deletePatientById(int id) {
        patientRepository.deleteById(id);
        String msg = "Patient deleted with id : " + id;
        return msg;
    }
}
