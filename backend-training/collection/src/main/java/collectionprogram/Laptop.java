package collectionprogram;

public class Laptop  { //*implements Comparable<Laptop>*//

    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ComparatorClass{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

//    @Override
//    public int compareTo(Laptop lap2) {
//        //this > lap2 = +
//        // this < lap2 = -
//        //  this == lap2 = 0
//
//        if(this.getRam() >lap2.getRam())
//            return 1;
//        else
//            return -1;
//    }
}
