package com.padma.patient.patientmodule.service;

import com.padma.patient.patientmodule.dto.MobileAndNameDto;
import com.padma.patient.patientmodule.dto.PatientDto;
import java.util.List;

public interface PatientService {


    PatientDto patientRegistration(PatientDto dto);

    PatientDto upadatePatientInformation(PatientDto dto);

    void deletePatient(int id);

    List<PatientDto>findTenDaysBack();

    List<MobileAndNameDto> findMobileAndNameVisitedToday();


}
