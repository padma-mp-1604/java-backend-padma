package com.padma.patient.patientmodule.service;

import com.padma.patient.patientmodule.dto.MobileAndNameDto;
import com.padma.patient.patientmodule.dto.PatientDto;
import com.padma.patient.patientmodule.exception.DateOutOfBoundExecption;
import com.padma.patient.patientmodule.exception.InvalidIdExecption;
import com.padma.patient.patientmodule.exception.InvalidMobileNumberExecption;

import java.util.List;

public interface PatientService {


    PatientDto patientRegistration(PatientDto dto) throws InvalidIdExecption;

    PatientDto upadatePatientInformation(PatientDto dto) throws InvalidIdExecption;

    void deletePatient(int id) throws InvalidIdExecption;

    List<PatientDto>findTenDaysBack() ;

    List<MobileAndNameDto> findMobileAndNameVisitedToday() throws DateOutOfBoundExecption;


}
