package com.padma.patient.patientmodule.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DtoTests {
    @DisplayName("Testing Object Nullability")
    @Test
    void testInValidObject() {
        PatientDto pa = null;
        Assertions.assertNull(pa);
    }
    @DisplayName("PatientDto Valid Object")
    @Test
    void testPatientDtoValidObject() {
        PatientDto pat = new PatientDto();
        Assertions.assertNotNull(pat);
    }
}
