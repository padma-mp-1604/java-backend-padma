package com.padma.ormdemo.repository;

import com.padma.ormdemo.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarCrudRepo extends CrudRepository<Car, Long > {

    @Override
    List<Car> findAll();
}
