package spring.ioc;

public class Dell implements Laptop{

    @Override
    public void coding() {
        System.out.println("this is coding method of Dell class");
    }

    @Override
    public void browsing() {

        System.out.println("this is browsing method of Dell class");

    }
}
