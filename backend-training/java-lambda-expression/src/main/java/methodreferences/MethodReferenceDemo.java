package methodreferences;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Function<Integer, Double> function =(input) -> Math.sqrt(input);
        System.out.println(function.apply(16));

        Function<Double, Double> function1 =(input)-> Math.sqrt(input);
        System.out.println(function1.apply(25d));

        Function<Integer, Double>function3 =    Math::sqrt;
        System.out.println(function3.apply(16));

        Function<Integer, Double> function4 =Math::sqrt;
        System.out.println(function4.apply(25));

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) ->MethodReference.addition(a,b);
        System.out.println(biFunction.apply(10, 20));

        BiFunction<Integer, Integer, Integer> biFunction1 =MethodReference::addition;
        System.out.println(biFunction1.apply(10,20));

    }
}
