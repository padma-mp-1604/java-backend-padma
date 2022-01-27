package com.paddu.car;


import com.paddu.tempo.Tempo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    public Tempo tempo;

    public void speedUp() {
        System.out.println("Speeding Up the Car");
    }



}
