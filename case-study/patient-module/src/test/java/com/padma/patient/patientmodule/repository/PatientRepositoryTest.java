package com.padma.patient.patientmodule.repository;

import com.padma.patient.patientmodule.domain.Patient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PatientRepositoryTest {



    @DisplayName("Patient Repo : Creating Patient")
    @Test
    public void testCreatePatient() {

        var abc = new Patient();
        abc.setId(565);
        abc.setName("abc");
        abc.setAge(56);
        abc.setLastVisited(LocalDate.now());

        repository.save(abc);
    }
}
}
