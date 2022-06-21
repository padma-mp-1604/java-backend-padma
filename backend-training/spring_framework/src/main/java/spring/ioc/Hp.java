package spring.ioc;

public class Hp implements Laptop{

    private final Dell dell;
    public  Hp(Dell dell, Dell dell1){
        this.dell = dell1;
    }

    @Override
    public void coding() {
        System.out.println("this is coding method of Hp class");
    }
    @Override
    public void browsing() {
        System.out.println("this is browsing method of Hp class");

    }
}
