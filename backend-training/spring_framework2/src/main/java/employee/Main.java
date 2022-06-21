package employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee e1 = context.getBean("employee", Employee.class);
        e1.setId(1);
        e1.setName("abc");
        System.out.println(e1.getId() + " " + e1.getName());
    }
}
