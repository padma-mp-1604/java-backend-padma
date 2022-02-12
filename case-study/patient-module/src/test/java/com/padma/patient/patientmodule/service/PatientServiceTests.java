//package com.padma.patient.patientmodule.service;
//
//import com.padma.patient.patientmodule.domain.Patient;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import java.sql.Date;
//import java.time.LocalDate;
//
//@SpringBootTest
//public class PatientServiceTests {
//
//    @Autowired
//    private PatientService service;
//
//    @DisplayName("service : Patient not Null")
//    @Test
//    public void testPatientSave() {
//        Patient patient = new Patient();
//        patient.setId(1);
//        patient.setName("abc");
//        patient.setMobile("1234567891");
//        patient.setAge(25);
//        patient.setStatus(false);
//        patient.setLastVisited(LocalDate.of(2022, 2, 1));
//
//
//
//        Patient resPatient = service.patientRegistration(PatientDto);
//        Assertions.assertNotNull(null);
//
//
//
//    }
//
//
//}
