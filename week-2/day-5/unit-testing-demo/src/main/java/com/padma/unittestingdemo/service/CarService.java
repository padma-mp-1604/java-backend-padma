package com.padma.unittestingdemo.service;

import com.padma.unittestingdemo.domain.Car;

import java.util.Optional;

import java.util.Optional;

public interface CarService {
    Car saveCar(Car car);

    Optional<Car> findCarById(Long id);
}