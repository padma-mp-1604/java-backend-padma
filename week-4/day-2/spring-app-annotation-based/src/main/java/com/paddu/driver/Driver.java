package com.paddu.driver;

import com.paddu.car.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Driver {

    @Autowired
    private Car car;
}
