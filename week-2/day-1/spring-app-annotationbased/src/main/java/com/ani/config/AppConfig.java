package com.ani.config;

import com.ani.car.Car;
import com.ani.driver.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// hey spring you will find all beans in side given paackage
//annotation based, this is our bean.xml file in the form of java
@ComponentScan("com.ani")
@Configuration
public class AppConfig {

    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Driver driver() {
        return new Driver();
    }
}