package com.padma.patient.patientmodule.controller;

import com.padma.patient.patientmodule.domain.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PatientControllerTests {

    @Autowired
    private TestRestTemplate template;
    @LocalServerPort
    private int port;

    @DisplayName("Get Patient Checking Object Is non null")
    @Test
    public void testGetMethod(){
        String url = "http://"+"localhost"+":"+port+"/patient";
        Patient patient = template.getForObject(url,Patient.class);
        Assertions.assertNotNull(patient);
    }
    @DisplayName("Patient Delete")
    @Test
    public void testDeleteMethod(){
        String url = "http://" + "localhost"+":"+port+"/patient";
        template.delete(url);
    }
}
