package staticanddefaultmethod;

public class Main {
    public static void main(String[] args) {
        LaptopImpl l1 = new LaptopImpl();

        l1.dell();
        l1.hp();
        l1.lenovo();
        l1.apple();

        Laptop.electronic();
    }
}
