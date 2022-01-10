package com.ani.car;

import org.springframework.beans.factory.annotation.Autowired;
import com.ani.tempo.Tempo;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Tempo tempo;

    public void speedUp()
    {
        System.out.println("Speeding Up Car");
    }
}
