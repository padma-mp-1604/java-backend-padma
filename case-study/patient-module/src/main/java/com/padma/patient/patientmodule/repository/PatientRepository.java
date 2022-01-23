package com.padma.patient.patientmodule.repository;

import com.padma.patient.patientmodule.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository  extends JpaRepository<Patient, Integer> {

    public List<Patient> findByLastVisited(LocalDate dt);





}
