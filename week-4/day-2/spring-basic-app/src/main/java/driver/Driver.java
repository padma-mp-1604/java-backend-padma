package driver;

import car.Car;

public class Driver {

//    private  final Car car;
//
//    public Driver(Car car) {           // constructor injection
//        this.car = car;
//    }

//    private Car car;
//
//    public void setCar(Car car) {
//        this.car=car;
//    }

    private final Car car;

    public Driver(Car car) {

        this.car = car;
    }

    public Car getCar() {

        return car;
    }
}
