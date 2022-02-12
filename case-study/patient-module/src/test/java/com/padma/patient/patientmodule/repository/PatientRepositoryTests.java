package com.padma.patient.patientmodule.repository;


import com.padma.patient.patientmodule.domain.Patient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;


@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE )

public class PatientRepositoryTests {
    @Autowired
    private PatientRepository repository;

    @DisplayName("Patient Registration")
    @Test
    public void testcreatePatientRegistration(){

        var patient = new Patient();
        patient.setId(10);
        patient.setName("ashu");
        patient.setMobile("76545865123");
        patient.setAge(67);
        patient.setStatus(false);
        patient.setLastVisited(LocalDate.now());
        repository.save(patient);
    }
}
