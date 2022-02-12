package com.padma.patient.patientmodule.controller;

import com.padma.patient.patientmodule.domain.Patient;
import com.padma.patient.patientmodule.dto.AppResponse;
import com.padma.patient.patientmodule.dto.PatientDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PatientControllerTests {

    @Autowired
    private TestRestTemplate template;

    @LocalServerPort
    private int port;

    @DisplayName("POST - Patient - Saving Patient Object")
    @Test
    public void testPostMethod() {
        String url = "http://" + "localhost" + ":" + port + "/patient";
        var patient = new PatientDto();
        patient.setId(1);
        patient.setName("vidya");
        patient.setMobile("7678938991");
        patient.setStatus(false);
        patient.setLastVisited(LocalDate.of(2022, 1, 12));
        var re = template.postForEntity(url, patient, AppResponse.class);
        Assertions.assertEquals(HttpStatus.OK, re.getStatusCode());
    }

    @DisplayName("Get Patient Checking Object Is non null")
    @Test
    public void testGetMethod(){
        String url = "http://"+"localhost"+":"+port+"/patient";
        Patient patient = template.getForObject(url,Patient.class);
        Assertions.assertNotNull(patient);
    }

    @DisplayName("Patient Delete")
    @Test
    public void testDeleteMethod() {
        String url = "http://" + "localhost" + ":" + port + "/patient";
        template.delete(url);
    }
}
