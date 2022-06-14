package staticanddefaultmethod;

public interface Laptop {
    void dell();
    void hp();

    public default void lenovo(){
        System.out.println("this is lenovo laptop");
    }

    public default void apple(){
        System.out.println("this is apple laptop");
    }

     static void electronic(){
         System.out.println("these are all electronic item");
    }

}
