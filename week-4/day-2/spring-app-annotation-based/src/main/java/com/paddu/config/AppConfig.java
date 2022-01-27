package com.paddu.config;

import com.paddu.car.Car;
import com.paddu.driver.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.paddu")
@Configuration
public class AppConfig {
//
//    @Bean
//    public  Car car()
//    {
//        return new  Car();
//    }
//    @Bean
//    public Driver driver() {
//
//        return new Driver();
//    }


}
