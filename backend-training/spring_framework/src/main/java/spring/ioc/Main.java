package spring.ioc;

import object_creation.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");

        // lets we use context

      //  Hp hp1 = (Hp)context.getBean("hp"); // spring give bean and store in Student . getBean method returning a object and object cannot be cast to Hp so we TypeCasting

//        Dell d1 = context.getBean("dell", Dell.class);
//        d1.coding();
//        d1.browsing();

        Laptop lap = context.getBean("laptop", Laptop.class);
        lap.coding();
        lap.browsing();


    }
}
