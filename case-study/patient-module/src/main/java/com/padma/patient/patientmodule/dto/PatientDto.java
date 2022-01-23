package com.padma.patient.patientmodule.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PatientDto {

    private int id;

    @NotNull
    private  String name;
    private String mobile;
    @NotNull
    private int age;
    @NotNull
    private Boolean status;
    private LocalDate lastVisited;

}
