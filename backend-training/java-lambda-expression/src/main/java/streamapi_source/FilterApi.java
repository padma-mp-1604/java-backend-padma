package streamapi_source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;


public class FilterApi {
    public static void main(String[] args) {

//        List<String> fruits = Arrays.asList("apple", "orange", "banana", "kiwi");
//
//        fruits.stream()
//                .map(String::toUpperCase)
//                .filter(x -> x.startsWith("b"))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
        // filter method is used for check functional condition

        List<String> cities=Arrays.asList("shimoga","BANGALORE", "delhi");
        cities.
        stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("b"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<String>fruits=Arrays.asList("apple","orange","banana","kiwi");
        List<String> FR=fruits
                .stream().map(String::toUpperCase)
                .filter(a ->a.startsWith("B"))
               .collect(Collectors.toList());
        System.out.println(FR);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);




    }
}
