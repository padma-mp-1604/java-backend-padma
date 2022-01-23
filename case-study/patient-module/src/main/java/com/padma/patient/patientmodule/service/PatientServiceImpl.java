package com.padma.patient.patientmodule.service;

import com.padma.patient.patientmodule.domain.Patient;
import com.padma.patient.patientmodule.dto.MobileAndNameDto;
import com.padma.patient.patientmodule.dto.PatientDto;
import com.padma.patient.patientmodule.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;
import java.time.LocalDate;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Transactional(
        isolation = Isolation.READ_UNCOMMITTED,
        rollbackFor = SQLException.class
)

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository repository;

    @Override
    public PatientDto patientRegistration(PatientDto dto) {

        var patient = new Patient();
        patient.setId(dto.getId());
        patient.setName(dto.getName());
        patient.setMobile(dto.getMobile());
        patient.setAge(dto.getAge());
        patient.setStatus(dto.getStatus());
        patient.setLastVisited(dto.getLastVisited());
        repository.save(patient);
        return dto;
    }
    @Override
    public PatientDto upadatePatientInformation(PatientDto dto) {
        Patient patient = repository.findById(dto.getId()).orElse(null);
        var patient1 = new Patient();
        patient1.setId(dto.getId());
        patient1.setName(dto.getName());
        patient1.setMobile(dto.getMobile());
        patient1.setAge(dto.getAge());
        patient1.setStatus(dto.getStatus());
        patient1.setLastVisited(dto.getLastVisited());
        repository.save(patient1);
        return dto;
    }
    @Override
    public void deletePatient(int id) {
        repository.deleteById(id);
    }
    @Override
    public List<PatientDto> findTenDaysBack() {
        LocalDate dt = LocalDate.now();
        LocalDate backDate = dt.minusDays(10);
        List<Patient> patients = repository.findByLastVisited(backDate);
        List<PatientDto> patientDtos = new ArrayList<>();

        for(int i=0;i<patients.size();i++) {
            Patient patient1 = patients.get(i);
            PatientDto dto = new PatientDto(

                    patient1.getId(),
                    patient1.getName(),
                    patient1.getMobile(),
                    patient1.getAge(),
                    patient1.getStatus(),
                    patient1.getLastVisited()
            );
            patientDtos.add(dto);
        }
        return patientDtos;
    }

    @Override
    public List<MobileAndNameDto> findMobileAndNameVisitedToday() {
        LocalDate dt = LocalDate.now();
        List<Patient> patients = repository.findByLastVisited(dt);

        List<MobileAndNameDto> patientDtos = new ArrayList<>();

        for(int i=0;i<patients.size();i++) {
            Patient patient1 = patients.get(i);
            MobileAndNameDto dto = new MobileAndNameDto();
            dto.setMobile(patient1.getMobile());
            dto.setName(patient1.getName());

            patientDtos.add(dto);
        }
        return patientDtos;
    }
}
