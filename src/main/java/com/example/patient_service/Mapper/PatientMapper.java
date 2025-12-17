package com.example.patient_service.Mapper;

import java.time.LocalDate;

import com.example.patient_service.Dto.PatientRequestDTO;
import com.example.patient_service.Dto.PatientResponseDTO;
import com.example.patient_service.model.PatientModel;

public class PatientMapper {
  public static PatientResponseDTO toDTO(PatientModel patient) {
    PatientResponseDTO patientDTO = new PatientResponseDTO();
    patientDTO.setId(patient.getId().toString());
    patientDTO.setName(patient.getName());
    patientDTO.setAddress(patient.getAddress());
    patientDTO.setEmail(patient.getEmail());
    patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());

    return patientDTO;
  }

  public static PatientModel toModel(PatientRequestDTO patientRequestDTO) {
    PatientModel patient = new PatientModel();
    patient.setName(patientRequestDTO.getName());
    patient.setAddress(patientRequestDTO.getAddress());
    patient.setEmail(patientRequestDTO.getEmail());
    patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
    patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
    return patient;
  }
}