package com.padma.patient.patientmodule.service;

import com.padma.patient.patientmodule.domain.Patient;
import com.padma.patient.patientmodule.dto.PatientDto;
import com.padma.patient.patientmodule.repository.PatientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientServiceImpTests {
//    @MockBean
//    private Repository repository;

    @Autowired
    private PatientService service;

    @DisplayName("Testing patient registration method")
    @Test
    public void testCreatePatient() {
        Patient patient = new Patient();
        patient.setId(1);
        patient.setName("abc");
        patient.setMobile("1234567891");
        patient.setAge(25);
        patient.setStatus(false);
        patient.setLastVisited(LocalDate.of(2022, 2, 1));
        assertEquals(1, patient.getId());
        assertEquals("abc", patient.getName());
        assertEquals("1234567891", patient.getMobile());
        assertEquals(25, patient.getAge());
        assertEquals(false, patient.getStatus());
        assertEquals(LocalDate.of(2022, 2, 1), patient.getLastVisited());

    }

    @DisplayName("Testing Update Method")
    @Test
    public void testUpdateMethod() {
        PatientDto patient1 = new PatientDto();
        patient1.setId(10);
        var patient = new PatientDto();
        patient.setId(11);
        patient.setName("pinku");
        patient.setMobile("76988586516");
        patient.setAge(49);
        patient.setStatus(false);
        patient.setLastVisited(LocalDate.of(2022, 2, 1));
        assertEquals(11, patient.getId());
    }

//    @DisplayName("testing Delete Method")
//    @Test
//    public void testDeleteMethod() {
//
//        Patient patient1 = new Patient();
//        ArgumentCaptor<Patient> arg = ArgumentCaptor.forClass(Patient.class);
//        service.deletePatient(patient1.getId());
//        verify(repository).deleteById(arg.capture().getId());
//
//      //  verify(doseRepository).deleteById(arg.capture().getDoseId());
//        assertEquals("120", arg.getValue().getValue());
//        //assertEquals()






}
