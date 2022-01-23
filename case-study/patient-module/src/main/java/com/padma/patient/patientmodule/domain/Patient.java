package com.padma.patient.patientmodule.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(unique = false, nullable = false)
    private  String name;

    @Column(unique = true, nullable = true)
    private String mobile;

    @NotNull
    @Column(unique = false, nullable = false)
    private int age;

    @NotNull
    @Column(unique = false, nullable = false)
    private Boolean status;

    @Column(unique = false, nullable = true)
    private LocalDate lastVisited;

}
