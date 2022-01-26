package car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Car car = new  Car();
        //Driver driver = new Driver(car);

//        Driver driver = new Driver();
//        driver.setCar(car);


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Car car1 = (Car) context.getBean("car");
        car1.setSpeed(100);

        Class<Car> cls = Car.class;
        Car car2 = context.getBean(cls);

        // Car car2= context.getBean(Car.class);
        System.out.println("car speed is " + car2.getSpeed());

    }
}
