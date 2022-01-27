package com.paddu;

import com.paddu.car.Bmw;
import com.paddu.car.Car;
import com.paddu.config.AppConfig;
import com.paddu.driver.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car1 =  (Car) context.getBean("car");

        Bmw bmw = (Bmw) context.getBean("bmw");
        bmw.openWindow();

        Driver driver1 = (Driver) context.getBean("driver");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
