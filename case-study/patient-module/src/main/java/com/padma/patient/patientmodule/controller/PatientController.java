package com.padma.patient.patientmodule.controller;

import com.padma.patient.patientmodule.dto.AppResponse;
import com.padma.patient.patientmodule.dto.MobileAndNameDto;
import com.padma.patient.patientmodule.dto.PatientDto;
import com.padma.patient.patientmodule.exception.InvalidIdExecption;
import com.padma.patient.patientmodule.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RequestMapping("/patient")
@RestController
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping
    public ResponseEntity<AppResponse<PatientDto>> createPatient(@Valid @RequestBody PatientDto dto) {

        var patient = service.patientRegistration(dto);
        var response = new AppResponse<PatientDto>();
        response.setStatus("success");
        response.setMessage("patient registered");
        response.setBody(patient);
        return ResponseEntity.ok(response);
    }
    @PutMapping("/update")
    public ResponseEntity<AppResponse<PatientDto>> upadatePatientInfo(@Valid @RequestBody PatientDto dto) {
        var patient = service.upadatePatientInformation(dto);
        var response = new AppResponse<PatientDto>();
        response.setStatus("success");
        response.setMessage("patient information updated");
        response.setBody(patient);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<AppResponse<PatientDto>> deletePatient(@PathVariable("id") int id) throws InvalidIdExecption {
        service.deletePatient(id);
        var response = new AppResponse<PatientDto>();
        response.setStatus("success");
        response.setMessage("patient deleted successfully");
        return ResponseEntity.ok(response);
    }
    @GetMapping("/search/lastVisited")
    public ResponseEntity<AppResponse<List<PatientDto>>> findAllPatient() {
        var patientAll = service.findTenDaysBack();
        var response = new AppResponse<List<PatientDto>>();
        response.setStatus("success");
        response.setMessage("show all 10 days patient");
        response.setBody(patientAll);
        return ResponseEntity.ok(response);
    }

}





