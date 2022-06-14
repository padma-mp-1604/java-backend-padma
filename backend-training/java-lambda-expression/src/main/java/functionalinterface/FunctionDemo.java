package functionalinterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = new FuctionImpl();
        System.out.println(function.apply("padma"));

        Function<String, Integer> function1 = (String s) -> s.length();
        System.out.println(function1.apply("padma"));
    }
}
