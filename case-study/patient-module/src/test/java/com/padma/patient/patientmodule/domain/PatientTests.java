package com.padma.patient.patientmodule.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PatientTests {
    @DisplayName("Testing Object Nullability")
    @Test
    void testInValidObject() {
        Patient pa = null;
        Assertions.assertNull(pa);
    }
    @DisplayName("Patient Valid Object")
    @Test
    void testPatientValidObject() {
        Patient pat = new Patient();
        Assertions.assertNotNull(pat);
    }

    @DisplayName("Domain : Checking getters and setters")
    @Test
    void testObjectGettersSetters() {
        var patient = new Patient();
        patient.setId(1);
        patient.setName("vidya");
        patient.setMobile("7678938991");
        patient.setAge(19);
        patient.setStatus(false);
        patient.setLastVisited(LocalDate.of(2022,1,12));
        Assertions.assertEquals(1, patient.getId());
        Assertions.assertEquals("vidya" , patient.getName());
        Assertions.assertEquals(19,patient.getAge());
        Assertions.assertEquals(false,patient.getStatus());
        Assertions.assertEquals("7678938991", patient.getMobile());
    }
}
